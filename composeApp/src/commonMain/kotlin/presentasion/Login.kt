package presentasion

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import themes.PoppinsFamily


@Composable
fun LoginPage() {
    var usernameController by remember { mutableStateOf("") }
    var passwordController by remember { mutableStateOf("") }
    Column (modifier = Modifier.fillMaxWidth().padding(start = 24.dp, end = 24.dp, top = 70.dp)) {
        Text("Welcome Back", style = TextStyle(
            fontWeight = FontWeight.Bold,
            fontFamily = PoppinsFamily(),
            fontSize = 24.sp
        ))
        Text(modifier = Modifier.padding(top = 8.dp),text = "Login to access your account", style = TextStyle(
            fontSize = 14.sp,
            fontFamily = PoppinsFamily(),
            color = Color(0xff888888)
        )
        )
        Text(modifier = Modifier.fillMaxWidth().padding(
            top = 60.dp,
            bottom = 10.dp
        ) ,text="Email",style = TextStyle(
            color = Color(color = 0xff888888),
            fontFamily = PoppinsFamily(),
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp
        ))
        OutlinedTextField(
            textStyle = TextStyle(
                fontSize = 16.sp
            ),
            modifier = Modifier.fillMaxWidth().height(52.dp),
            value = usernameController,
            shape = RoundedCornerShape(12.dp),
            onValueChange= {usernameController = it},
            placeholder = {Text("john.doe")}
        )
        Text(modifier = Modifier.fillMaxWidth().padding(
            top = 24.dp,
            bottom = 10.dp
        ) ,text="Password",style = TextStyle(
            color = Color(color = 0xff888888),
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp
        ))
        OutlinedTextField(
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth().padding(
                bottom = 20.dp
            ).height(52.dp),
            textStyle = TextStyle(
                fontSize = 16.sp
            ),
            value = passwordController,
            shape = RoundedCornerShape(12.dp),
            onValueChange= {passwordController = it},
            placeholder = {Text("*****")}
        )
        Button(
            modifier = Modifier.fillMaxWidth().height(56.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff21BDCA), contentColor = Color.White),
            onClick = {}, shape = RoundedCornerShape(20.dp)) {
            Text(text = "Sign In", style = TextStyle(
                fontSize = 18.sp,
                fontFamily = PoppinsFamily(),
                fontWeight = FontWeight.Bold

            ))
        }
        Text(
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally).padding(top = 24.dp),
            text = "Or Sign In With", style = TextStyle(
            fontSize = 12.sp, fontFamily = PoppinsFamily(), color = Color(0xff888888)
        )
        )
        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 24.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Dont Have an account? ", style = TextStyle(
                fontSize = 14.sp,
                fontFamily = PoppinsFamily(),
                color = Color(0xff888888)
            ))
            Text("Sign Up", style = TextStyle(
                color = Color(0xff21BDCA),
                fontFamily = PoppinsFamily(),
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
            ))
        }
    }
}
