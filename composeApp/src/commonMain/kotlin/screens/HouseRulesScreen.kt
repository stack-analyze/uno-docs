package screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.KeyboardArrowUp
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import components.HouseRule
import scripts.data.houseRules

@Composable
fun HouseRulesScreen() {
    // state
    var ruleTitle by remember { mutableStateOf("oficiales") }
    var expanded by remember { mutableStateOf(false) }
    val state = rememberLazyListState()

    // dynamic
    val dropdownIcon =
        if (expanded) Icons.Outlined.KeyboardArrowUp else Icons.Outlined.KeyboardArrowDown

    // static
    val options = listOf("oficiales", "exclusivas", "no oficiales")

    // styles
    val dropdownStyles = Modifier
        .clickable { expanded = true }
        .fillMaxWidth().wrapContentSize(Alignment.TopStart)

    Column {
        Box(modifier = dropdownStyles) {
            ListItem(
                headlineContent = { Text("reglas $ruleTitle") },
                trailingContent = { Icon(dropdownIcon, "dropdown") }
            )

            DropdownMenu(
                expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier.fillMaxWidth()
            ) {
                options.forEachIndexed { i, it ->
                    DropdownMenuItem(
                        leadingIcon = { Text("${i + 1})") },
                        text = { Text(it) },
                        onClick = {
                            expanded = false
                            ruleTitle = it
                        }
                    )
                }
            }
        }

        LazyColumn(state = state) {
            val rules = houseRules[ruleTitle]!!

            items(rules) { (title, desc) ->
                HouseRule(title, desc)
            }
        }
    }

}