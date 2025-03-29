package icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val ic_poker_diamond: ImageVector
    get() {
        if (_icPokerDiamond != null) {
            return _icPokerDiamond!!
        }
        _icPokerDiamond = Builder(name = "IcPokerDiamond", defaultWidth = 56.052.dp, defaultHeight =
        72.007.dp, viewportWidth = 56.052f, viewportHeight = 72.007f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                strokeLineWidth = 4.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveToRelative(27.963f, 0.001f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.781f, 1.219f)
                curveToRelative(-5.43f, 12.985f, -14.353f, 23.761f, -25.469f, 33.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 3.063f)
                curveToRelative(11.116f, 9.489f, 20.038f, 20.265f, 25.469f, 33.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.688f, 0.0f)
                curveToRelative(5.43f, -12.985f, 14.353f, -23.761f, 25.469f, -33.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -3.063f)
                curveTo(44.223f, 24.981f, 35.3f, 14.205f, 29.87f, 1.22f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 27.963f, 0.001f)
                close()
                moveTo(28.026f, 6.439f)
                curveTo(33.503f, 17.794f, 41.459f, 27.494f, 51.088f, 36.001f)
                curveTo(41.459f, 44.508f, 33.503f, 54.208f, 28.026f, 65.564f)
                curveTo(22.549f, 54.208f, 14.593f, 44.508f, 4.963f, 36.001f)
                curveTo(14.593f, 27.494f, 22.549f, 17.794f, 28.026f, 6.439f)
                close()
            }
        }
            .build()
        return _icPokerDiamond!!
    }

private var _icPokerDiamond: ImageVector? = null