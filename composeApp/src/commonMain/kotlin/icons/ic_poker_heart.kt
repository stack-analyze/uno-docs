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

public val ic_poker_heart: ImageVector
    get() {
        if (_icPokerHeart != null) {
            return _icPokerHeart!!
        }
        _icPokerHeart = Builder(name = "IcPokerHeart", defaultWidth = 70.0.dp, defaultHeight =
        63.994.dp, viewportWidth = 70.0f, viewportHeight = 63.994f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 0.0f)
                curveTo(12.52f, 0.0f, 7.936f, 2.304f, 4.813f, 6.094f)
                curveTo(1.689f, 9.884f, 0.0f, 15.12f, 0.0f, 21.0f)
                curveToRelative(0.0f, 8.124f, 6.274f, 14.802f, 13.563f, 21.438f)
                curveToRelative(7.289f, 6.636f, 15.731f, 13.313f, 20.594f, 21.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.688f, 0.0f)
                curveTo(40.707f, 55.75f, 49.149f, 49.073f, 56.438f, 42.438f)
                curveTo(63.726f, 35.802f, 70.0f, 29.124f, 70.0f, 21.0f)
                curveTo(70.0f, 15.12f, 68.311f, 9.884f, 65.188f, 6.094f)
                curveTo(62.064f, 2.304f, 57.48f, 0.0f, 52.0f, 0.0f)
                curveTo(47.239f, 0.0f, 43.267f, 1.934f, 40.25f, 4.594f)
                curveTo(37.84f, 6.719f, 36.182f, 9.281f, 35.0f, 11.781f)
                curveTo(33.818f, 9.281f, 32.16f, 6.719f, 29.75f, 4.594f)
                curveTo(26.733f, 1.934f, 22.761f, 0.0f, 18.0f, 0.0f)
                close()
                moveTo(18.0f, 2.0f)
                curveToRelative(4.223f, 0.0f, 7.711f, 1.69f, 10.438f, 4.094f)
                curveToRelative(2.726f, 2.404f, 4.662f, 5.542f, 5.625f, 8.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.875f, 0.0f)
                curveToRelative(0.963f, -2.708f, 2.899f, -5.846f, 5.625f, -8.25f)
                curveTo(44.289f, 3.69f, 47.777f, 2.0f, 52.0f, 2.0f)
                curveToRelative(4.927f, 0.0f, 8.85f, 2.008f, 11.625f, 5.375f)
                curveTo(66.4f, 10.742f, 68.0f, 15.506f, 68.0f, 21.0f)
                curveTo(68.0f, 28.07f, 62.274f, 34.403f, 55.063f, 40.969f)
                curveTo(48.195f, 47.221f, 40.194f, 53.65f, 35.0f, 61.344f)
                curveTo(29.806f, 53.65f, 21.805f, 47.221f, 14.938f, 40.969f)
                curveTo(7.726f, 34.403f, 2.0f, 28.07f, 2.0f, 21.0f)
                curveTo(2.0f, 15.506f, 3.6f, 10.742f, 6.375f, 7.375f)
                curveTo(9.15f, 4.008f, 13.073f, 2.0f, 18.0f, 2.0f)
                close()
            }
        }
            .build()
        return _icPokerHeart!!
    }

private var _icPokerHeart: ImageVector? = null