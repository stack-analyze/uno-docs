package icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val Colorbind_red2: ImageVector
	get() {
		if (_Colorbind_red2 != null) {
			return _Colorbind_red2!!
		}
		_Colorbind_red2 = ImageVector.Builder(
            name = "Colorbind_red2",
            defaultWidth = 512.dp,
            defaultHeight = 512.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
			group {
				path(
    				fill = SolidColor(Color(0xFF231F20)),
    				fillAlpha = 1.0f,
    				stroke = null,
    				strokeAlpha = 1.0f,
    				strokeLineWidth = 1.0f,
    				strokeLineCap = StrokeCap.Butt,
    				strokeLineJoin = StrokeJoin.Miter,
    				strokeLineMiter = 1.0f,
    				pathFillType = PathFillType.EvenOdd
				) {
					moveTo(-3.913f, 255.933f)
					curveTo(-3.9130f, 397.3220f, 110.6970f, 511.9330f, 252.0870f, 511.9330f)
					curveTo(393.4760f, 511.9330f, 508.1170f, 397.3220f, 508.1170f, 255.9330f)
					curveTo(508.1170f, 114.5430f, 393.4760f, -0.0670f, 252.0870f, -0.0670f)
					curveTo(110.6970f, -0.0670f, -3.9130f, 114.5430f, -3.9130f, 255.9330f)
					close()
				}
}
		}.build()
		return _Colorbind_red2!!
	}

private var _Colorbind_red2: ImageVector? = null
