package themes

import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import kotlinproject.composeapp.generated.resources.*
import org.jetbrains.compose.resources.Font

@Composable
fun PoppinsFamily() = FontFamily(
    Font(Res.font.poppins_regular, weight = FontWeight.Normal),
    Font(Res.font.poppins_medium, weight = FontWeight.Medium),
    Font(Res.font.poppins_semibold, weight = FontWeight.SemiBold),
    Font(Res.font.poppins_bold, weight = FontWeight.Bold)
)

@Composable
fun PoppinsTypography() = Typography(
    h1 = TextStyle(
        fontFamily = PoppinsFamily(),
        fontWeight = FontWeight.SemiBold,
        fontSize = 52.sp,
    ),
    h2 = TextStyle(fontFamily = PoppinsFamily(), fontWeight = FontWeight.Bold, fontSize = 24.sp),
    h3 = TextStyle(
        fontFamily = PoppinsFamily(),
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
    ),
    h4 = TextStyle(
        fontFamily = PoppinsFamily(),
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
    ),
    h5 = TextStyle(fontFamily = PoppinsFamily(), fontWeight = FontWeight.Bold, fontSize = 14.sp),
    h6 = TextStyle(
        fontFamily = PoppinsFamily(),
        fontWeight = FontWeight.SemiBold,
        fontSize = 12.sp,
    ),
    subtitle1 = TextStyle(
        fontFamily = PoppinsFamily(),
        fontWeight = FontWeight.W500,
        fontSize = 16.sp,
    ),
    subtitle2 = TextStyle(
        fontFamily = PoppinsFamily(),
        fontWeight = FontWeight.W400,
        fontSize = 14.sp,
    ),
    body1 = TextStyle(fontFamily = PoppinsFamily(), fontWeight = FontWeight.Normal, fontSize = 14.sp),
    body2 = TextStyle(fontFamily = PoppinsFamily(), fontSize = 10.sp),
    button = TextStyle(
        fontFamily = PoppinsFamily(), fontWeight = FontWeight.W400, fontSize = 15.sp
    ),
    caption = TextStyle(fontFamily = PoppinsFamily(), fontWeight = FontWeight.Normal, fontSize = 8.sp),
    overline = TextStyle(fontFamily = PoppinsFamily(), fontWeight = FontWeight.W400, fontSize = 12.sp)
)
