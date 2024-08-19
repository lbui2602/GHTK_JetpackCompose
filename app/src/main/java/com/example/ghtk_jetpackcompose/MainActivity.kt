@file:OptIn(ExperimentalLayoutApi::class)

package com.example.ghtk_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ghtk_jetpackcompose.ui.theme.GHTK_JetpackComposeTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GHTK_JetpackComposeTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    content = { innerPadding ->
                        UserProfileScreen(Modifier.padding(innerPadding))
                    }
                )
            }
        }
    }
}

@Composable
fun UserProfileScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        UserProfileHeader()
        Spacer(modifier = Modifier.height(16.dp))
        CategoryTabs()

        Divider(
            color = Color.LightGray,
            thickness = 1.dp,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Tab1()
        Divider(
            color = Color.LightGray,
            thickness = 1.dp,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Tab2()
        Divider(

            color = Color.LightGray,
            thickness = 10.dp,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Tab3()

        Divider(
            color = Color.LightGray,
            thickness = 1.dp,
        )
        OrderList()

    }
}

@Composable
fun Tab3() {
    Row(
        modifier = Modifier
            .fillMaxWidth()

    ){
        Column(modifier = Modifier.padding(5.dp,0.dp)
        ){
            Text("Hoạt động",Modifier.padding(5.dp), color = Color(0xFF15703A))
            Divider(
                color = Color(0xFF15703A),
                thickness = 2.dp,
                modifier = Modifier
                    .width(90.dp)
            )
        }
        Text("Nhận hàng",Modifier.padding(5.dp))
        Text("2lanstore",Modifier.padding(5.dp))
    }
}
@Composable
fun Tab2() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
    ){
        Column(modifier = Modifier.weight(1f)){
            Row{
                Text("38", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                Image(
                    painter = painterResource(id = R.drawable.love),
                    contentDescription = "Create Order",
                    modifier = Modifier.size(24.dp)
                )
                Text("10", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                Image(
                    painter = painterResource(id = R.drawable.sad),
                    contentDescription = "Create Order",
                    modifier = Modifier.size(24.dp)
                )
            }
            Text("Đánh giá")
        }
        Column(modifier = Modifier.weight(1f)){
            Text("10 Shop", fontWeight = FontWeight.Bold, fontSize = 20.sp)
            Text("Đã ghé thăm")
        }
        Column(modifier = Modifier.weight(1f)){
            Text("11 Shop", fontWeight = FontWeight.Bold,fontSize = 20.sp)
            Text("Đã mua")
        }
        Column(modifier = Modifier.weight(1f)){
            Text("--")
            Text("Chu kỳ mua")
        }
    }
}

@Composable
fun Tab1() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
    ){
        Column(modifier = Modifier.weight(1f)){
            Text("--")
            Text("Độ cháy túi")
        }

        Column(modifier = Modifier.weight(1f)){
            Text("80", fontWeight = FontWeight.Bold)
            Text("ĐH đã đặt")
        }

        Column(modifier = Modifier.weight(1f)){
            Text("--")
            Text("Thành công")
        }

        Column(modifier = Modifier.weight(1f)){
            Row{
                Icon(
                    painter = painterResource(id = R.drawable.baseline_rocket_launch_24),
                    contentDescription = "Create Order",
                    tint = Color(0xFF15703A),
                    modifier = Modifier.size(24.dp)
                )
                Text("Tên lửa", fontWeight = FontWeight.Bold)
            }
            Text("Tốc độ nhận")
        }
    }
}

@Composable
fun UserProfileHeader() {
    Row(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Circle with Number
        Box(
            modifier = Modifier
                .size(60.dp)
                .background(Color(0xFF15703A), shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Text("55", color = Color.White, fontSize = 24.sp, fontWeight = FontWeight.Bold)
        }

        Spacer(modifier = Modifier.width(16.dp))

        // Phone Number and Verification
        Column {
            Text("843***4455", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Row{
                Icon(
                    painter = painterResource(id = R.drawable.done),
                    contentDescription = "Create Order",
                    tint = Color(0xFF15703A),
                    modifier = Modifier.size(24.dp)
                )
                Text("Đã xác thực SDT & Địa chỉ", fontSize = 14.sp, color = Color.Gray)
            }
        }

        Spacer(modifier = Modifier.weight(1f))

        // Follow Button
        Box(
            modifier = Modifier
                .background(Color(0xFF15703A), shape = RoundedCornerShape(10.dp))
                .padding(5.dp) // Add padding to make it feel like a button
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_favorite_border_24),
                    contentDescription = "Create Order",
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(10.dp)) // Adds some spacing between the icon and the text
                Text("Theo dõi", color = Color.White)
            }
        }


    }
}

@Composable
fun CategoryTabs() {
    FlowRow(
        modifier = Modifier.padding(8.dp),
        maxItemsInEachRow = 3
    ) {
        val categories = listOf(
            "Thiết bị điện tử",
            "Voucher",
            "Thiết bị điện gia dụng",
            "Mẹ và bé",
            "Nhà cửa"
        )
        Box(
            modifier = Modifier
                .padding(5.dp)  // Margin
                .padding(3.dp)  // Padding
        ) {
            Text("Đã mua", textAlign = TextAlign.Center, fontSize = 16.sp)
        }

        categories.forEach { category ->
            val randomColor = remember {
                Color(
                    red = Random.nextFloat(),
                    green = Random.nextFloat(),
                    blue = Random.nextFloat()
                )
            }

            Box(
                modifier = Modifier
                    .padding(5.dp)  // Margin
                    .background(randomColor, shape = RoundedCornerShape(4.dp))
                    .padding(3.dp)  // Padding
            ) {
                Text(category, textAlign = TextAlign.Center, fontSize = 16.sp)

            }
        }
    }
}
@Composable
fun OrderList() {
    Row(modifier = Modifier.fillMaxWidth()){
        Column(modifier = Modifier.weight(7.5f)) {
            val orders = mutableListOf<Order>()
            for(i in 1..15){

                orders.add(Order("YEAHHH! hai đã đặt hàng sản phẩm Giá trị cao ${i}","${i}/10/2024"))
            }
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            ) {
                items(orders) { item ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                    ) {
                        Text(
                            text = item.content,
                            color = Color.Black,
                            modifier = Modifier.padding(top = 4.dp)
                                .weight(7f)
                        )
                        Text(
                            text = item.date,
                            color = Color.LightGray,
                            modifier = Modifier.padding(top = 4.dp)
                                .weight(3f),
                            fontStyle = FontStyle.Italic
                        )
                    }
                }
            }

        }
        Column(modifier = Modifier.weight(2.5f)) {
            Column(
                modifier = Modifier
                    .height(70.dp)
                    .width(90.dp)
                    .padding(5.dp)
                    .background(Color(0xFF15703A)),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(){
                    Icon(
                        painter = painterResource(id = R.drawable.phone),
                        contentDescription = "Create Order",
                        tint = Color.White,
                        modifier = Modifier.size(24.dp)
                    )
                    Text("(3)",color = Color.White, fontSize = 15.sp)
                }
                Text("Gọi điện", color = Color.White)
            }
            Column(
                modifier = Modifier
                    .height(70.dp)
                    .width(90.dp)
                    .padding(5.dp)
                    .background(Color(0xFF15703A)),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.chat),
                    contentDescription = "Create Order",
                    tint = Color.White,
                    modifier = Modifier.size(24.dp)
                )
                Text("Chat", color = Color.White)
            }
            Column(
                modifier = Modifier
                    .height(70.dp)
                    .width(90.dp)
                    .padding(5.dp)
                    .background(Color(0xFF15703A)),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.add),
                    contentDescription = "Create Order",
                    tint = Color.White,
                )
                Text("Tạo ĐH", color = Color.White)
            }
            Column(
                modifier = Modifier
                    .height(70.dp)
                    .width(90.dp)
                    .padding(5.dp)
                    .background(Color(0xFF15703A)),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.danhgia),
                    contentDescription = "Create Order",
                    tint = Color.White,
                    modifier = Modifier.size(24.dp)
                )
                Text("Đánh giá", color = Color.White)
            }
        }

    }
}

@Composable
fun Items() {

}

@Composable
fun OrderItem(orderText: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = orderText,
            modifier = Modifier.weight(1f),
            fontSize = 14.sp
        )

        // Action Buttons (Call, Chat, etc.)
        IconButton(onClick = { /*TODO: Call Action*/ }) {
            Icon(Icons.Default.Call, contentDescription = "Call", tint = Color.Green)
        }


        IconButton(onClick = { /*TODO: Create Order Action*/ }) {
            Icon(Icons.Default.Add, contentDescription = "Create Order", tint = Color.Green)
        }

        IconButton(onClick = { /*TODO: Rate Action*/ }) {
            Icon(Icons.Default.ThumbUp, contentDescription = "Rate", tint = Color.Green)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun UserProfileScreenPreview() {
    GHTK_JetpackComposeTheme {
        UserProfileScreen()
    }
}
