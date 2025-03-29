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

public val ic_poker_spade: ImageVector
    get() {
        if (_icPokerSpade != null) {
            return _icPokerSpade!!
        }
        _icPokerSpade = Builder(name = "IcPokerSpade", defaultWidth = 54.0.dp, defaultHeight =
        70.006.dp, viewportWidth = 54.0f, viewportHeight = 70.006f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveToRelative(26.875f, 0.006f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.75f, 0.531f)
                curveTo(21.203f, 9.89f, 14.762f, 16.405f, 9.469f, 22.881f)
                curveTo(4.175f, 29.358f, 0.0f, 35.896f, 0.0f, 45.006f)
                curveToRelative(0.0f, 3.664f, 1.122f, 6.686f, 3.094f, 8.781f)
                curveTo(5.065f, 55.883f, 7.861f, 57.006f, 11.0f, 57.006f)
                curveToRelative(3.583f, 0.0f, 6.371f, -1.375f, 8.5f, -2.813f)
                curveToRelative(-0.52f, 2.347f, -1.477f, 4.785f, -2.938f, 7.031f)
                curveToRelative(-1.922f, 2.955f, -4.333f, 5.522f, -6.188f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 70.006f)
                horizontalLineToRelative(32.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.625f, -1.781f)
                curveToRelative(-1.855f, -1.478f, -4.266f, -4.045f, -6.188f, -7.0f)
                curveTo(35.977f, 58.979f, 35.02f, 56.541f, 34.5f, 54.194f)
                curveTo(36.629f, 55.632f, 39.417f, 57.006f, 43.0f, 57.006f)
                curveTo(46.139f, 57.006f, 48.935f, 55.883f, 50.906f, 53.788f)
                curveTo(52.878f, 51.693f, 54.0f, 48.67f, 54.0f, 45.006f)
                curveTo(54.0f, 35.896f, 49.825f, 29.358f, 44.531f, 22.881f)
                curveTo(39.238f, 16.405f, 32.797f, 9.89f, 27.875f, 0.538f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 26.875f, 0.006f)
                close()
                moveTo(27.0f, 2.944f)
                curveTo(31.947f, 11.765f, 38.046f, 18.14f, 42.969f, 24.163f)
                curveTo(48.175f, 30.532f, 52.0f, 36.502f, 52.0f, 45.006f)
                curveTo(52.0f, 48.267f, 51.013f, 50.739f, 49.438f, 52.413f)
                curveTo(47.862f, 54.087f, 45.672f, 55.006f, 43.0f, 55.006f)
                curveTo(38.846f, 55.006f, 35.129f, 52.693f, 33.719f, 51.288f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 32.0f, 52.038f)
                curveToRelative(0.11f, 3.524f, 1.705f, 7.105f, 3.75f, 10.25f)
                curveToRelative(1.475f, 2.268f, 3.165f, 4.143f, 4.781f, 5.719f)
                horizontalLineToRelative(-27.063f)
                curveToRelative(1.616f, -1.576f, 3.306f, -3.451f, 4.781f, -5.719f)
                curveToRelative(2.045f, -3.145f, 3.64f, -6.726f, 3.75f, -10.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.719f, -0.75f)
                curveTo(18.871f, 52.693f, 15.154f, 55.006f, 11.0f, 55.006f)
                curveTo(8.328f, 55.006f, 6.138f, 54.087f, 4.563f, 52.413f)
                curveTo(2.987f, 50.739f, 2.0f, 48.267f, 2.0f, 45.006f)
                curveTo(2.0f, 36.502f, 5.825f, 30.532f, 11.031f, 24.163f)
                curveTo(15.954f, 18.14f, 22.053f, 11.765f, 27.0f, 2.944f)
                close()
            }
        }
            .build()
        return _icPokerSpade!!
    }

private var _icPokerSpade: ImageVector? = null