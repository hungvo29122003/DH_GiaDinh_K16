    import React from "react";
    import TypeProduct from "../../components/TypeProduct/TypeProduct";
    import {WrapperTypeProduct} from "./style"
    import SliderComponents from "../../components/SliderComponents/SliderComponents";
    import Slider1 from '../../accest/Slider1.webp'
    import Slider2 from '../../accest/Slider2.webp'
    import Slider3 from '../../accest/Slider3.webp'
    import Slider4 from '../../accest/Slider4.jpg'
    import Sider5  from '../../accest/Slider5.webp'
    import Sider6  from '../../accest/Slider6.webp'


    const HomePage = () => {
        const arr = ['laptop', 'Dien Thoai', 'Chuot']
        return (
            <div style={{ padding: '0 120px' }}>
                <WrapperTypeProduct>
                    {arr.map((item) => {
                        return (
                            <TypeProduct name={item} key={item} />

                        )
                    })}
                </WrapperTypeProduct>
                <SliderComponents  arrImages={[Slider1, Slider2, Slider3, Slider4,Sider5,Sider6]} />
                {/* HomePage */}
            </div>
        )
    }
    export default HomePage