import React from "react";
import TypeProduct from "../../components/TypeProduct/TypeProduct";
import { WrapperButtonMore, WrapperProducts, WrapperTypeProduct } from "./style"
import SliderComponents from "../../components/SliderComponents/SliderComponents";
import Slider1 from '../../accest/Slider1.webp'
import Slider2 from '../../accest/Slider2.webp'
import Slider3 from '../../accest/Slider3.webp'
import Slider4 from '../../accest/Slider4.jpg'
import Sider5 from '../../accest/Slider5.webp'
import Sider6 from '../../accest/Slider6.webp'
import './HomePage.css'
import CardComponents from "../../components/CarcComponents/CardComponents";
import NavbarComponents from "../../components/NavbarComponents/NavbarComponents";
import ButtonComponents from "../../components/ButtonComponents/ButtonComponents";


const HomePage = () => {
    const arr = ['laptop', 'Dien Thoai', 'Chuot']
    return (
        <>
            <div style={{ width: '1270px', margin: '0 auto' }}>
                <WrapperTypeProduct>
                    {arr.map((item) => {
                        return (
                            <TypeProduct name={item} key={item} />

                        )
                    })}
                </WrapperTypeProduct>
            </div>
            <div className="body" style={{width:'100%', backgroundColor: '#efefef'}}>
                <div id="container" style={{height: '1000px', width: '1270px', margin: '0 auto'}}>
                    <SliderComponents arrImages={[Slider1, Slider2, Slider3, Slider4, Sider5, Sider6]} />
                    <WrapperProducts>
                        <CardComponents />
                        <CardComponents />
                        <CardComponents />
                        <CardComponents />
                        <CardComponents />
                        <CardComponents />
                        <CardComponents />
                    </WrapperProducts>
                    {/* <NavbarComponents /> */}
                    <div style={{ width: '100%', display: 'flex', justifyContent: 'center', marginTop: '10px' }}>
                        <WrapperButtonMore textButton="Xem thêm" type="outline" styleButton={{
                            border: '1px solid rgb(11, 116, 229)',
                            color: 'rgb(11, 116, 219)',
                            // borderRadius: '0px',
                            width: '240px',
                            height: '38px',
                            borderRadius: '4px',
                        }}
                            styleTextButton={{ fontWeight: 500 }} />
                    </div>
                </div>
            </div>
        </>
    )
}
export default HomePage