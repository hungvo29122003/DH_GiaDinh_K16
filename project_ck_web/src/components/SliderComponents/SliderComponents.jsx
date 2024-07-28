import { Image} from "antd";
import React from "react";
import Slider from "react-slick";
import { WrapperSliderStyle } from "./style";


const SliderComponents = ({ arrImages }) => {
   const settings = {
      dots: true,
      infinite: true,
      speed: 500,
      slidesToShow: 1,
      slidesToScroll: 1,
      autoplay: true,
      autoplaySpeed: 1000
   };

   return (
      <WrapperSliderStyle {...settings} >
            {arrImages.map((image) => {
               return (
                  <Image src={image} alt="Slider" preview={false} width="100%"  />
               )
            })}
      </WrapperSliderStyle>
   )
}

export default SliderComponents