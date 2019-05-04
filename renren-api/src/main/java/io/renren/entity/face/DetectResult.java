package io.renren.entity.face;

import lombok.Data;

import java.util.List;

/**
 * @author mario
 */
@Data
public class DetectResult {
    /**
     * image_id : 0nntGdIEZo3hNwLqO9spWg==
     * request_id : 1554825892,d81e8c2a-2198-43b0-a6e9-dfe292cfdcda
     * time_used : 181
     * faces : [{"landmark":{"mouth_upper_lip_left_contour2":{"y":158,"x":83},"mouth_upper_lip_top":{"y":158,"x":92},"mouth_upper_lip_left_contour1":{"y":157,"x":89},"left_eye_upper_left_quarter":{"y":120,"x":67},"left_eyebrow_lower_middle":{"y":112,"x":67},"mouth_upper_lip_left_contour3":{"y":160,"x":85},"right_eye_top":{"y":116,"x":107},"left_eye_bottom":{"y":125,"x":70},"right_eyebrow_lower_left_quarter":{"y":110,"x":101},"right_eye_pupil":{"y":119,"x":107},"mouth_lower_lip_right_contour1":{"y":159,"x":100},"mouth_lower_lip_right_contour3":{"y":164,"x":99},"mouth_lower_lip_right_contour2":{"y":161,"x":103},"contour_chin":{"y":180,"x":95},"contour_left9":{"y":179,"x":85},"left_eye_lower_right_quarter":{"y":124,"x":75},"mouth_lower_lip_top":{"y":161,"x":92},"right_eyebrow_upper_middle":{"y":105,"x":107},"left_eyebrow_left_corner":{"y":113,"x":55},"right_eye_bottom":{"y":122,"x":109},"contour_left7":{"y":169,"x":70},"contour_left6":{"y":163,"x":65},"contour_left5":{"y":156,"x":60},"contour_left4":{"y":148,"x":57},"contour_left3":{"y":140,"x":55},"contour_left2":{"y":132,"x":52},"contour_left1":{"y":124,"x":51},"left_eye_lower_left_quarter":{"y":124,"x":67},"contour_right1":{"y":117,"x":129},"contour_right3":{"y":134,"x":128},"contour_right2":{"y":125,"x":129},"mouth_left_corner":{"y":159,"x":78},"contour_right4":{"y":142,"x":127},"contour_right7":{"y":166,"x":118},"right_eyebrow_left_corner":{"y":111,"x":94},"nose_right":{"y":144,"x":101},"nose_tip":{"y":143,"x":89},"contour_right5":{"y":150,"x":126},"nose_contour_lower_middle":{"y":150,"x":90},"left_eyebrow_lower_left_quarter":{"y":112,"x":61},"mouth_lower_lip_left_contour3":{"y":164,"x":87},"right_eye_right_corner":{"y":117,"x":115},"right_eye_lower_right_quarter":{"y":120,"x":113},"mouth_upper_lip_right_contour2":{"y":157,"x":101},"right_eyebrow_lower_right_quarter":{"y":107,"x":114},"left_eye_left_corner":{"y":122,"x":64},"mouth_right_corner":{"y":157,"x":107},"mouth_upper_lip_right_contour3":{"y":159,"x":99},"right_eye_lower_left_quarter":{"y":122,"x":104},"left_eyebrow_right_corner":{"y":112,"x":80},"left_eyebrow_lower_right_quarter":{"y":113,"x":73},"right_eye_center":{"y":119,"x":108},"nose_left":{"y":146,"x":79},"mouth_lower_lip_left_contour1":{"y":160,"x":85},"left_eye_upper_right_quarter":{"y":120,"x":75},"right_eyebrow_lower_middle":{"y":108,"x":108},"left_eye_top":{"y":119,"x":71},"left_eye_center":{"y":122,"x":71},"contour_left8":{"y":175,"x":77},"contour_right9":{"y":177,"x":105},"right_eye_left_corner":{"y":122,"x":100},"mouth_lower_lip_bottom":{"y":165,"x":93},"left_eyebrow_upper_left_quarter":{"y":109,"x":61},"left_eye_pupil":{"y":121,"x":72},"right_eyebrow_upper_left_quarter":{"y":107,"x":100},"contour_right8":{"y":172,"x":112},"right_eyebrow_right_corner":{"y":107,"x":121},"right_eye_upper_left_quarter":{"y":118,"x":103},"left_eyebrow_upper_middle":{"y":108,"x":67},"right_eyebrow_upper_right_quarter":{"y":104,"x":114},"nose_contour_left1":{"y":122,"x":82},"nose_contour_left2":{"y":139,"x":81},"mouth_upper_lip_right_contour1":{"y":157,"x":95},"nose_contour_right1":{"y":122,"x":94},"nose_contour_right2":{"y":138,"x":98},"mouth_lower_lip_left_contour2":{"y":162,"x":82},"contour_right6":{"y":158,"x":123},"nose_contour_right3":{"y":147,"x":96},"nose_contour_left3":{"y":148,"x":84},"left_eye_right_corner":{"y":123,"x":78},"left_eyebrow_upper_right_quarter":{"y":109,"x":74},"right_eye_upper_right_quarter":{"y":116,"x":112},"mouth_upper_lip_bottom":{"y":161,"x":92}},"attributes":{"emotion":{"sadness":18.142,"neutral":7.229,"disgust":0.071,"anger":0.071,"surprise":2.795,"fear":0.181,"happiness":71.511},"beauty":{"female_score":70.401,"male_score":69.587},"gender":{"value":"Female"},"age":{"value":22},"mouthstatus":{"close":100,"surgical_mask_or_respirator":0,"open":0,"other_occlusion":0},"glass":{"value":"None"},"skinstatus":{"dark_circle":3.637,"stain":7.451,"acne":1.113,"health":74.071},"headpose":{"yaw_angle":5.1354847,"pitch_angle":14.155868,"roll_angle":-6.694192},"blur":{"blurness":{"threshold":50,"value":0.467},"motionblur":{"threshold":50,"value":0.467},"gaussianblur":{"threshold":50,"value":0.467}},"smile":{"threshold":50,"value":48.971},"eyestatus":{"left_eye_status":{"normal_glass_eye_open":0.008,"no_glass_eye_close":0,"occlusion":0,"no_glass_eye_open":99.992,"normal_glass_eye_close":0,"dark_glasses":0},"right_eye_status":{"normal_glass_eye_open":0.074,"no_glass_eye_close":0,"occlusion":0,"no_glass_eye_open":99.926,"normal_glass_eye_close":0,"dark_glasses":0}},"facequality":{"threshold":70.1,"value":82.617},"ethnicity":{"value":"ASIAN"},"eyegaze":{"right_eye_gaze":{"position_x_coordinate":0.476,"vector_z_component":0.999,"vector_x_component":-0.034,"vector_y_component":-0.02,"position_y_coordinate":0.417},"left_eye_gaze":{"position_x_coordinate":0.541,"vector_z_component":0.986,"vector_x_component":0.101,"vector_y_component":-0.134,"position_y_coordinate":0.397}}},"face_rectangle":{"width":79,"top":103,"left":52,"height":79},"face_token":"629f74ca879ecc3e0e05227b806f98a0"}]
     */

    private String image_id;
    private String request_id;
    private int time_used;
    private List<FacesBean> faces;

    @Data
    public static class FacesBean {
        /**
         * landmark : {"mouth_upper_lip_left_contour2":{"y":158,"x":83},"mouth_upper_lip_top":{"y":158,"x":92},"mouth_upper_lip_left_contour1":{"y":157,"x":89},"left_eye_upper_left_quarter":{"y":120,"x":67},"left_eyebrow_lower_middle":{"y":112,"x":67},"mouth_upper_lip_left_contour3":{"y":160,"x":85},"right_eye_top":{"y":116,"x":107},"left_eye_bottom":{"y":125,"x":70},"right_eyebrow_lower_left_quarter":{"y":110,"x":101},"right_eye_pupil":{"y":119,"x":107},"mouth_lower_lip_right_contour1":{"y":159,"x":100},"mouth_lower_lip_right_contour3":{"y":164,"x":99},"mouth_lower_lip_right_contour2":{"y":161,"x":103},"contour_chin":{"y":180,"x":95},"contour_left9":{"y":179,"x":85},"left_eye_lower_right_quarter":{"y":124,"x":75},"mouth_lower_lip_top":{"y":161,"x":92},"right_eyebrow_upper_middle":{"y":105,"x":107},"left_eyebrow_left_corner":{"y":113,"x":55},"right_eye_bottom":{"y":122,"x":109},"contour_left7":{"y":169,"x":70},"contour_left6":{"y":163,"x":65},"contour_left5":{"y":156,"x":60},"contour_left4":{"y":148,"x":57},"contour_left3":{"y":140,"x":55},"contour_left2":{"y":132,"x":52},"contour_left1":{"y":124,"x":51},"left_eye_lower_left_quarter":{"y":124,"x":67},"contour_right1":{"y":117,"x":129},"contour_right3":{"y":134,"x":128},"contour_right2":{"y":125,"x":129},"mouth_left_corner":{"y":159,"x":78},"contour_right4":{"y":142,"x":127},"contour_right7":{"y":166,"x":118},"right_eyebrow_left_corner":{"y":111,"x":94},"nose_right":{"y":144,"x":101},"nose_tip":{"y":143,"x":89},"contour_right5":{"y":150,"x":126},"nose_contour_lower_middle":{"y":150,"x":90},"left_eyebrow_lower_left_quarter":{"y":112,"x":61},"mouth_lower_lip_left_contour3":{"y":164,"x":87},"right_eye_right_corner":{"y":117,"x":115},"right_eye_lower_right_quarter":{"y":120,"x":113},"mouth_upper_lip_right_contour2":{"y":157,"x":101},"right_eyebrow_lower_right_quarter":{"y":107,"x":114},"left_eye_left_corner":{"y":122,"x":64},"mouth_right_corner":{"y":157,"x":107},"mouth_upper_lip_right_contour3":{"y":159,"x":99},"right_eye_lower_left_quarter":{"y":122,"x":104},"left_eyebrow_right_corner":{"y":112,"x":80},"left_eyebrow_lower_right_quarter":{"y":113,"x":73},"right_eye_center":{"y":119,"x":108},"nose_left":{"y":146,"x":79},"mouth_lower_lip_left_contour1":{"y":160,"x":85},"left_eye_upper_right_quarter":{"y":120,"x":75},"right_eyebrow_lower_middle":{"y":108,"x":108},"left_eye_top":{"y":119,"x":71},"left_eye_center":{"y":122,"x":71},"contour_left8":{"y":175,"x":77},"contour_right9":{"y":177,"x":105},"right_eye_left_corner":{"y":122,"x":100},"mouth_lower_lip_bottom":{"y":165,"x":93},"left_eyebrow_upper_left_quarter":{"y":109,"x":61},"left_eye_pupil":{"y":121,"x":72},"right_eyebrow_upper_left_quarter":{"y":107,"x":100},"contour_right8":{"y":172,"x":112},"right_eyebrow_right_corner":{"y":107,"x":121},"right_eye_upper_left_quarter":{"y":118,"x":103},"left_eyebrow_upper_middle":{"y":108,"x":67},"right_eyebrow_upper_right_quarter":{"y":104,"x":114},"nose_contour_left1":{"y":122,"x":82},"nose_contour_left2":{"y":139,"x":81},"mouth_upper_lip_right_contour1":{"y":157,"x":95},"nose_contour_right1":{"y":122,"x":94},"nose_contour_right2":{"y":138,"x":98},"mouth_lower_lip_left_contour2":{"y":162,"x":82},"contour_right6":{"y":158,"x":123},"nose_contour_right3":{"y":147,"x":96},"nose_contour_left3":{"y":148,"x":84},"left_eye_right_corner":{"y":123,"x":78},"left_eyebrow_upper_right_quarter":{"y":109,"x":74},"right_eye_upper_right_quarter":{"y":116,"x":112},"mouth_upper_lip_bottom":{"y":161,"x":92}}
         * attributes : {"emotion":{"sadness":18.142,"neutral":7.229,"disgust":0.071,"anger":0.071,"surprise":2.795,"fear":0.181,"happiness":71.511},"beauty":{"female_score":70.401,"male_score":69.587},"gender":{"value":"Female"},"age":{"value":22},"mouthstatus":{"close":100,"surgical_mask_or_respirator":0,"open":0,"other_occlusion":0},"glass":{"value":"None"},"skinstatus":{"dark_circle":3.637,"stain":7.451,"acne":1.113,"health":74.071},"headpose":{"yaw_angle":5.1354847,"pitch_angle":14.155868,"roll_angle":-6.694192},"blur":{"blurness":{"threshold":50,"value":0.467},"motionblur":{"threshold":50,"value":0.467},"gaussianblur":{"threshold":50,"value":0.467}},"smile":{"threshold":50,"value":48.971},"eyestatus":{"left_eye_status":{"normal_glass_eye_open":0.008,"no_glass_eye_close":0,"occlusion":0,"no_glass_eye_open":99.992,"normal_glass_eye_close":0,"dark_glasses":0},"right_eye_status":{"normal_glass_eye_open":0.074,"no_glass_eye_close":0,"occlusion":0,"no_glass_eye_open":99.926,"normal_glass_eye_close":0,"dark_glasses":0}},"facequality":{"threshold":70.1,"value":82.617},"ethnicity":{"value":"ASIAN"},"eyegaze":{"right_eye_gaze":{"position_x_coordinate":0.476,"vector_z_component":0.999,"vector_x_component":-0.034,"vector_y_component":-0.02,"position_y_coordinate":0.417},"left_eye_gaze":{"position_x_coordinate":0.541,"vector_z_component":0.986,"vector_x_component":0.101,"vector_y_component":-0.134,"position_y_coordinate":0.397}}}
         * face_rectangle : {"width":79,"top":103,"left":52,"height":79}
         * face_token : 629f74ca879ecc3e0e05227b806f98a0
         */

        private LandmarkBean landmark;
        private AttributesBean attributes;
        private FaceRectangleBean face_rectangle;
        private String face_token;

        @Data
        public static class LandmarkBean {
            /**
             * mouth_upper_lip_left_contour2 : {"y":158,"x":83}
             * mouth_upper_lip_top : {"y":158,"x":92}
             * mouth_upper_lip_left_contour1 : {"y":157,"x":89}
             * left_eye_upper_left_quarter : {"y":120,"x":67}
             * left_eyebrow_lower_middle : {"y":112,"x":67}
             * mouth_upper_lip_left_contour3 : {"y":160,"x":85}
             * right_eye_top : {"y":116,"x":107}
             * left_eye_bottom : {"y":125,"x":70}
             * right_eyebrow_lower_left_quarter : {"y":110,"x":101}
             * right_eye_pupil : {"y":119,"x":107}
             * mouth_lower_lip_right_contour1 : {"y":159,"x":100}
             * mouth_lower_lip_right_contour3 : {"y":164,"x":99}
             * mouth_lower_lip_right_contour2 : {"y":161,"x":103}
             * contour_chin : {"y":180,"x":95}
             * contour_left9 : {"y":179,"x":85}
             * left_eye_lower_right_quarter : {"y":124,"x":75}
             * mouth_lower_lip_top : {"y":161,"x":92}
             * right_eyebrow_upper_middle : {"y":105,"x":107}
             * left_eyebrow_left_corner : {"y":113,"x":55}
             * right_eye_bottom : {"y":122,"x":109}
             * contour_left7 : {"y":169,"x":70}
             * contour_left6 : {"y":163,"x":65}
             * contour_left5 : {"y":156,"x":60}
             * contour_left4 : {"y":148,"x":57}
             * contour_left3 : {"y":140,"x":55}
             * contour_left2 : {"y":132,"x":52}
             * contour_left1 : {"y":124,"x":51}
             * left_eye_lower_left_quarter : {"y":124,"x":67}
             * contour_right1 : {"y":117,"x":129}
             * contour_right3 : {"y":134,"x":128}
             * contour_right2 : {"y":125,"x":129}
             * mouth_left_corner : {"y":159,"x":78}
             * contour_right4 : {"y":142,"x":127}
             * contour_right7 : {"y":166,"x":118}
             * right_eyebrow_left_corner : {"y":111,"x":94}
             * nose_right : {"y":144,"x":101}
             * nose_tip : {"y":143,"x":89}
             * contour_right5 : {"y":150,"x":126}
             * nose_contour_lower_middle : {"y":150,"x":90}
             * left_eyebrow_lower_left_quarter : {"y":112,"x":61}
             * mouth_lower_lip_left_contour3 : {"y":164,"x":87}
             * right_eye_right_corner : {"y":117,"x":115}
             * right_eye_lower_right_quarter : {"y":120,"x":113}
             * mouth_upper_lip_right_contour2 : {"y":157,"x":101}
             * right_eyebrow_lower_right_quarter : {"y":107,"x":114}
             * left_eye_left_corner : {"y":122,"x":64}
             * mouth_right_corner : {"y":157,"x":107}
             * mouth_upper_lip_right_contour3 : {"y":159,"x":99}
             * right_eye_lower_left_quarter : {"y":122,"x":104}
             * left_eyebrow_right_corner : {"y":112,"x":80}
             * left_eyebrow_lower_right_quarter : {"y":113,"x":73}
             * right_eye_center : {"y":119,"x":108}
             * nose_left : {"y":146,"x":79}
             * mouth_lower_lip_left_contour1 : {"y":160,"x":85}
             * left_eye_upper_right_quarter : {"y":120,"x":75}
             * right_eyebrow_lower_middle : {"y":108,"x":108}
             * left_eye_top : {"y":119,"x":71}
             * left_eye_center : {"y":122,"x":71}
             * contour_left8 : {"y":175,"x":77}
             * contour_right9 : {"y":177,"x":105}
             * right_eye_left_corner : {"y":122,"x":100}
             * mouth_lower_lip_bottom : {"y":165,"x":93}
             * left_eyebrow_upper_left_quarter : {"y":109,"x":61}
             * left_eye_pupil : {"y":121,"x":72}
             * right_eyebrow_upper_left_quarter : {"y":107,"x":100}
             * contour_right8 : {"y":172,"x":112}
             * right_eyebrow_right_corner : {"y":107,"x":121}
             * right_eye_upper_left_quarter : {"y":118,"x":103}
             * left_eyebrow_upper_middle : {"y":108,"x":67}
             * right_eyebrow_upper_right_quarter : {"y":104,"x":114}
             * nose_contour_left1 : {"y":122,"x":82}
             * nose_contour_left2 : {"y":139,"x":81}
             * mouth_upper_lip_right_contour1 : {"y":157,"x":95}
             * nose_contour_right1 : {"y":122,"x":94}
             * nose_contour_right2 : {"y":138,"x":98}
             * mouth_lower_lip_left_contour2 : {"y":162,"x":82}
             * contour_right6 : {"y":158,"x":123}
             * nose_contour_right3 : {"y":147,"x":96}
             * nose_contour_left3 : {"y":148,"x":84}
             * left_eye_right_corner : {"y":123,"x":78}
             * left_eyebrow_upper_right_quarter : {"y":109,"x":74}
             * right_eye_upper_right_quarter : {"y":116,"x":112}
             * mouth_upper_lip_bottom : {"y":161,"x":92}
             */

            private MouthUpperLipLeftContour2Bean mouth_upper_lip_left_contour2;
            private MouthUpperLipTopBean mouth_upper_lip_top;
            private MouthUpperLipLeftContour1Bean mouth_upper_lip_left_contour1;
            private LeftEyeUpperLeftQuarterBean left_eye_upper_left_quarter;
            private LeftEyebrowLowerMiddleBean left_eyebrow_lower_middle;
            private MouthUpperLipLeftContour3Bean mouth_upper_lip_left_contour3;
            private RightEyeTopBean right_eye_top;
            private LeftEyeBottomBean left_eye_bottom;
            private RightEyebrowLowerLeftQuarterBean right_eyebrow_lower_left_quarter;
            private RightEyePupilBean right_eye_pupil;
            private MouthLowerLipRightContour1Bean mouth_lower_lip_right_contour1;
            private MouthLowerLipRightContour3Bean mouth_lower_lip_right_contour3;
            private MouthLowerLipRightContour2Bean mouth_lower_lip_right_contour2;
            private ContourChinBean contour_chin;
            private ContourLeft9Bean contour_left9;
            private LeftEyeLowerRightQuarterBean left_eye_lower_right_quarter;
            private MouthLowerLipTopBean mouth_lower_lip_top;
            private RightEyebrowUpperMiddleBean right_eyebrow_upper_middle;
            private LeftEyebrowLeftCornerBean left_eyebrow_left_corner;
            private RightEyeBottomBean right_eye_bottom;
            private ContourLeft7Bean contour_left7;
            private ContourLeft6Bean contour_left6;
            private ContourLeft5Bean contour_left5;
            private ContourLeft4Bean contour_left4;
            private ContourLeft3Bean contour_left3;
            private ContourLeft2Bean contour_left2;
            private ContourLeft1Bean contour_left1;
            private LeftEyeLowerLeftQuarterBean left_eye_lower_left_quarter;
            private ContourRight1Bean contour_right1;
            private ContourRight3Bean contour_right3;
            private ContourRight2Bean contour_right2;
            private MouthLeftCornerBean mouth_left_corner;
            private ContourRight4Bean contour_right4;
            private ContourRight7Bean contour_right7;
            private RightEyebrowLeftCornerBean right_eyebrow_left_corner;
            private NoseRightBean nose_right;
            private NoseTipBean nose_tip;
            private ContourRight5Bean contour_right5;
            private NoseContourLowerMiddleBean nose_contour_lower_middle;
            private LeftEyebrowLowerLeftQuarterBean left_eyebrow_lower_left_quarter;
            private MouthLowerLipLeftContour3Bean mouth_lower_lip_left_contour3;
            private RightEyeRightCornerBean right_eye_right_corner;
            private RightEyeLowerRightQuarterBean right_eye_lower_right_quarter;
            private MouthUpperLipRightContour2Bean mouth_upper_lip_right_contour2;
            private RightEyebrowLowerRightQuarterBean right_eyebrow_lower_right_quarter;
            private LeftEyeLeftCornerBean left_eye_left_corner;
            private MouthRightCornerBean mouth_right_corner;
            private MouthUpperLipRightContour3Bean mouth_upper_lip_right_contour3;
            private RightEyeLowerLeftQuarterBean right_eye_lower_left_quarter;
            private LeftEyebrowRightCornerBean left_eyebrow_right_corner;
            private LeftEyebrowLowerRightQuarterBean left_eyebrow_lower_right_quarter;
            private RightEyeCenterBean right_eye_center;
            private NoseLeftBean nose_left;
            private MouthLowerLipLeftContour1Bean mouth_lower_lip_left_contour1;
            private LeftEyeUpperRightQuarterBean left_eye_upper_right_quarter;
            private RightEyebrowLowerMiddleBean right_eyebrow_lower_middle;
            private LeftEyeTopBean left_eye_top;
            private LeftEyeCenterBean left_eye_center;
            private ContourLeft8Bean contour_left8;
            private ContourRight9Bean contour_right9;
            private RightEyeLeftCornerBean right_eye_left_corner;
            private MouthLowerLipBottomBean mouth_lower_lip_bottom;
            private LeftEyebrowUpperLeftQuarterBean left_eyebrow_upper_left_quarter;
            private LeftEyePupilBean left_eye_pupil;
            private RightEyebrowUpperLeftQuarterBean right_eyebrow_upper_left_quarter;
            private ContourRight8Bean contour_right8;
            private RightEyebrowRightCornerBean right_eyebrow_right_corner;
            private RightEyeUpperLeftQuarterBean right_eye_upper_left_quarter;
            private LeftEyebrowUpperMiddleBean left_eyebrow_upper_middle;
            private RightEyebrowUpperRightQuarterBean right_eyebrow_upper_right_quarter;
            private NoseContourLeft1Bean nose_contour_left1;
            private NoseContourLeft2Bean nose_contour_left2;
            private MouthUpperLipRightContour1Bean mouth_upper_lip_right_contour1;
            private NoseContourRight1Bean nose_contour_right1;
            private NoseContourRight2Bean nose_contour_right2;
            private MouthLowerLipLeftContour2Bean mouth_lower_lip_left_contour2;
            private ContourRight6Bean contour_right6;
            private NoseContourRight3Bean nose_contour_right3;
            private NoseContourLeft3Bean nose_contour_left3;
            private LeftEyeRightCornerBean left_eye_right_corner;
            private LeftEyebrowUpperRightQuarterBean left_eyebrow_upper_right_quarter;
            private RightEyeUpperRightQuarterBean right_eye_upper_right_quarter;
            private MouthUpperLipBottomBean mouth_upper_lip_bottom;


            @Data
            public static class MouthUpperLipLeftContour2Bean {
                /**
                 * y : 158
                 * x : 83
                 */

                private int y;
                private int x;

            }

            @Data
            public static class MouthUpperLipTopBean {
                /**
                 * y : 158
                 * x : 92
                 */

                private int y;
                private int x;

            }

            public static class MouthUpperLipLeftContour1Bean {
                /**
                 * y : 157
                 * x : 89
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeUpperLeftQuarterBean {
                /**
                 * y : 120
                 * x : 67
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyebrowLowerMiddleBean {
                /**
                 * y : 112
                 * x : 67
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthUpperLipLeftContour3Bean {
                /**
                 * y : 160
                 * x : 85
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeTopBean {
                /**
                 * y : 116
                 * x : 107
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeBottomBean {
                /**
                 * y : 125
                 * x : 70
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyebrowLowerLeftQuarterBean {
                /**
                 * y : 110
                 * x : 101
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyePupilBean {
                /**
                 * y : 119
                 * x : 107
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLowerLipRightContour1Bean {
                /**
                 * y : 159
                 * x : 100
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLowerLipRightContour3Bean {
                /**
                 * y : 164
                 * x : 99
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLowerLipRightContour2Bean {
                /**
                 * y : 161
                 * x : 103
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourChinBean {
                /**
                 * y : 180
                 * x : 95
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft9Bean {
                /**
                 * y : 179
                 * x : 85
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeLowerRightQuarterBean {
                /**
                 * y : 124
                 * x : 75
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLowerLipTopBean {
                /**
                 * y : 161
                 * x : 92
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyebrowUpperMiddleBean {
                /**
                 * y : 105
                 * x : 107
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyebrowLeftCornerBean {
                /**
                 * y : 113
                 * x : 55
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeBottomBean {
                /**
                 * y : 122
                 * x : 109
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft7Bean {
                /**
                 * y : 169
                 * x : 70
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft6Bean {
                /**
                 * y : 163
                 * x : 65
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft5Bean {
                /**
                 * y : 156
                 * x : 60
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft4Bean {
                /**
                 * y : 148
                 * x : 57
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft3Bean {
                /**
                 * y : 140
                 * x : 55
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft2Bean {
                /**
                 * y : 132
                 * x : 52
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft1Bean {
                /**
                 * y : 124
                 * x : 51
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeLowerLeftQuarterBean {
                /**
                 * y : 124
                 * x : 67
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight1Bean {
                /**
                 * y : 117
                 * x : 129
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight3Bean {
                /**
                 * y : 134
                 * x : 128
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight2Bean {
                /**
                 * y : 125
                 * x : 129
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLeftCornerBean {
                /**
                 * y : 159
                 * x : 78
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight4Bean {
                /**
                 * y : 142
                 * x : 127
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight7Bean {
                /**
                 * y : 166
                 * x : 118
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyebrowLeftCornerBean {
                /**
                 * y : 111
                 * x : 94
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseRightBean {
                /**
                 * y : 144
                 * x : 101
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseTipBean {
                /**
                 * y : 143
                 * x : 89
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight5Bean {
                /**
                 * y : 150
                 * x : 126
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseContourLowerMiddleBean {
                /**
                 * y : 150
                 * x : 90
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyebrowLowerLeftQuarterBean {
                /**
                 * y : 112
                 * x : 61
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLowerLipLeftContour3Bean {
                /**
                 * y : 164
                 * x : 87
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeRightCornerBean {
                /**
                 * y : 117
                 * x : 115
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeLowerRightQuarterBean {
                /**
                 * y : 120
                 * x : 113
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthUpperLipRightContour2Bean {
                /**
                 * y : 157
                 * x : 101
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyebrowLowerRightQuarterBean {
                /**
                 * y : 107
                 * x : 114
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeLeftCornerBean {
                /**
                 * y : 122
                 * x : 64
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthRightCornerBean {
                /**
                 * y : 157
                 * x : 107
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthUpperLipRightContour3Bean {
                /**
                 * y : 159
                 * x : 99
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeLowerLeftQuarterBean {
                /**
                 * y : 122
                 * x : 104
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyebrowRightCornerBean {
                /**
                 * y : 112
                 * x : 80
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyebrowLowerRightQuarterBean {
                /**
                 * y : 113
                 * x : 73
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeCenterBean {
                /**
                 * y : 119
                 * x : 108
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseLeftBean {
                /**
                 * y : 146
                 * x : 79
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLowerLipLeftContour1Bean {
                /**
                 * y : 160
                 * x : 85
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeUpperRightQuarterBean {
                /**
                 * y : 120
                 * x : 75
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyebrowLowerMiddleBean {
                /**
                 * y : 108
                 * x : 108
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeTopBean {
                /**
                 * y : 119
                 * x : 71
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeCenterBean {
                /**
                 * y : 122
                 * x : 71
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft8Bean {
                /**
                 * y : 175
                 * x : 77
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight9Bean {
                /**
                 * y : 177
                 * x : 105
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeLeftCornerBean {
                /**
                 * y : 122
                 * x : 100
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLowerLipBottomBean {
                /**
                 * y : 165
                 * x : 93
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyebrowUpperLeftQuarterBean {
                /**
                 * y : 109
                 * x : 61
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyePupilBean {
                /**
                 * y : 121
                 * x : 72
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyebrowUpperLeftQuarterBean {
                /**
                 * y : 107
                 * x : 100
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight8Bean {
                /**
                 * y : 172
                 * x : 112
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyebrowRightCornerBean {
                /**
                 * y : 107
                 * x : 121
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeUpperLeftQuarterBean {
                /**
                 * y : 118
                 * x : 103
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyebrowUpperMiddleBean {
                /**
                 * y : 108
                 * x : 67
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyebrowUpperRightQuarterBean {
                /**
                 * y : 104
                 * x : 114
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseContourLeft1Bean {
                /**
                 * y : 122
                 * x : 82
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseContourLeft2Bean {
                /**
                 * y : 139
                 * x : 81
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthUpperLipRightContour1Bean {
                /**
                 * y : 157
                 * x : 95
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseContourRight1Bean {
                /**
                 * y : 122
                 * x : 94
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseContourRight2Bean {
                /**
                 * y : 138
                 * x : 98
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLowerLipLeftContour2Bean {
                /**
                 * y : 162
                 * x : 82
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight6Bean {
                /**
                 * y : 158
                 * x : 123
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseContourRight3Bean {
                /**
                 * y : 147
                 * x : 96
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseContourLeft3Bean {
                /**
                 * y : 148
                 * x : 84
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeRightCornerBean {
                /**
                 * y : 123
                 * x : 78
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyebrowUpperRightQuarterBean {
                /**
                 * y : 109
                 * x : 74
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeUpperRightQuarterBean {
                /**
                 * y : 116
                 * x : 112
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthUpperLipBottomBean {
                /**
                 * y : 161
                 * x : 92
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }
        }

        public static class AttributesBean {
            /**
             * emotion : {"sadness":18.142,"neutral":7.229,"disgust":0.071,"anger":0.071,"surprise":2.795,"fear":0.181,"happiness":71.511}
             * beauty : {"female_score":70.401,"male_score":69.587}
             * gender : {"value":"Female"}
             * age : {"value":22}
             * mouthstatus : {"close":100,"surgical_mask_or_respirator":0,"open":0,"other_occlusion":0}
             * glass : {"value":"None"}
             * skinstatus : {"dark_circle":3.637,"stain":7.451,"acne":1.113,"health":74.071}
             * headpose : {"yaw_angle":5.1354847,"pitch_angle":14.155868,"roll_angle":-6.694192}
             * blur : {"blurness":{"threshold":50,"value":0.467},"motionblur":{"threshold":50,"value":0.467},"gaussianblur":{"threshold":50,"value":0.467}}
             * smile : {"threshold":50,"value":48.971}
             * eyestatus : {"left_eye_status":{"normal_glass_eye_open":0.008,"no_glass_eye_close":0,"occlusion":0,"no_glass_eye_open":99.992,"normal_glass_eye_close":0,"dark_glasses":0},"right_eye_status":{"normal_glass_eye_open":0.074,"no_glass_eye_close":0,"occlusion":0,"no_glass_eye_open":99.926,"normal_glass_eye_close":0,"dark_glasses":0}}
             * facequality : {"threshold":70.1,"value":82.617}
             * ethnicity : {"value":"ASIAN"}
             * eyegaze : {"right_eye_gaze":{"position_x_coordinate":0.476,"vector_z_component":0.999,"vector_x_component":-0.034,"vector_y_component":-0.02,"position_y_coordinate":0.417},"left_eye_gaze":{"position_x_coordinate":0.541,"vector_z_component":0.986,"vector_x_component":0.101,"vector_y_component":-0.134,"position_y_coordinate":0.397}}
             */

            private EmotionBean emotion;
            private BeautyBean beauty;
            private GenderBean gender;
            private AgeBean age;
            private MouthstatusBean mouthstatus;
            private GlassBean glass;
            private SkinstatusBean skinstatus;
            private HeadposeBean headpose;
            private BlurBean blur;
            private SmileBean smile;
            private EyestatusBean eyestatus;
            private FacequalityBean facequality;
            private EthnicityBean ethnicity;
            private EyegazeBean eyegaze;

            public EmotionBean getEmotion() {
                return emotion;
            }

            public void setEmotion(EmotionBean emotion) {
                this.emotion = emotion;
            }

            public BeautyBean getBeauty() {
                return beauty;
            }

            public void setBeauty(BeautyBean beauty) {
                this.beauty = beauty;
            }

            public GenderBean getGender() {
                return gender;
            }

            public void setGender(GenderBean gender) {
                this.gender = gender;
            }

            public AgeBean getAge() {
                return age;
            }

            public void setAge(AgeBean age) {
                this.age = age;
            }

            public MouthstatusBean getMouthstatus() {
                return mouthstatus;
            }

            public void setMouthstatus(MouthstatusBean mouthstatus) {
                this.mouthstatus = mouthstatus;
            }

            public GlassBean getGlass() {
                return glass;
            }

            public void setGlass(GlassBean glass) {
                this.glass = glass;
            }

            public SkinstatusBean getSkinstatus() {
                return skinstatus;
            }

            public void setSkinstatus(SkinstatusBean skinstatus) {
                this.skinstatus = skinstatus;
            }

            public HeadposeBean getHeadpose() {
                return headpose;
            }

            public void setHeadpose(HeadposeBean headpose) {
                this.headpose = headpose;
            }

            public BlurBean getBlur() {
                return blur;
            }

            public void setBlur(BlurBean blur) {
                this.blur = blur;
            }

            public SmileBean getSmile() {
                return smile;
            }

            public void setSmile(SmileBean smile) {
                this.smile = smile;
            }

            public EyestatusBean getEyestatus() {
                return eyestatus;
            }

            public void setEyestatus(EyestatusBean eyestatus) {
                this.eyestatus = eyestatus;
            }

            public FacequalityBean getFacequality() {
                return facequality;
            }

            public void setFacequality(FacequalityBean facequality) {
                this.facequality = facequality;
            }

            public EthnicityBean getEthnicity() {
                return ethnicity;
            }

            public void setEthnicity(EthnicityBean ethnicity) {
                this.ethnicity = ethnicity;
            }

            public EyegazeBean getEyegaze() {
                return eyegaze;
            }

            public void setEyegaze(EyegazeBean eyegaze) {
                this.eyegaze = eyegaze;
            }

            public static class EmotionBean {
                /**
                 * sadness : 18.142
                 * neutral : 7.229
                 * disgust : 0.071
                 * anger : 0.071
                 * surprise : 2.795
                 * fear : 0.181
                 * happiness : 71.511
                 */

                private double sadness;
                private double neutral;
                private double disgust;
                private double anger;
                private double surprise;
                private double fear;
                private double happiness;

                public double getSadness() {
                    return sadness;
                }

                public void setSadness(double sadness) {
                    this.sadness = sadness;
                }

                public double getNeutral() {
                    return neutral;
                }

                public void setNeutral(double neutral) {
                    this.neutral = neutral;
                }

                public double getDisgust() {
                    return disgust;
                }

                public void setDisgust(double disgust) {
                    this.disgust = disgust;
                }

                public double getAnger() {
                    return anger;
                }

                public void setAnger(double anger) {
                    this.anger = anger;
                }

                public double getSurprise() {
                    return surprise;
                }

                public void setSurprise(double surprise) {
                    this.surprise = surprise;
                }

                public double getFear() {
                    return fear;
                }

                public void setFear(double fear) {
                    this.fear = fear;
                }

                public double getHappiness() {
                    return happiness;
                }

                public void setHappiness(double happiness) {
                    this.happiness = happiness;
                }
            }

            public static class BeautyBean {
                /**
                 * female_score : 70.401
                 * male_score : 69.587
                 */

                private double female_score;
                private double male_score;

                public double getFemale_score() {
                    return female_score;
                }

                public void setFemale_score(double female_score) {
                    this.female_score = female_score;
                }

                public double getMale_score() {
                    return male_score;
                }

                public void setMale_score(double male_score) {
                    this.male_score = male_score;
                }
            }

            public static class GenderBean {
                /**
                 * value : Female
                 */

                private String value;

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            public static class AgeBean {
                /**
                 * value : 22
                 */

                private int value;

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class MouthstatusBean {
                /**
                 * close : 100.0
                 * surgical_mask_or_respirator : 0.0
                 * open : 0.0
                 * other_occlusion : 0.0
                 */

                private double close;
                private double surgical_mask_or_respirator;
                private double open;
                private double other_occlusion;

                public double getClose() {
                    return close;
                }

                public void setClose(double close) {
                    this.close = close;
                }

                public double getSurgical_mask_or_respirator() {
                    return surgical_mask_or_respirator;
                }

                public void setSurgical_mask_or_respirator(double surgical_mask_or_respirator) {
                    this.surgical_mask_or_respirator = surgical_mask_or_respirator;
                }

                public double getOpen() {
                    return open;
                }

                public void setOpen(double open) {
                    this.open = open;
                }

                public double getOther_occlusion() {
                    return other_occlusion;
                }

                public void setOther_occlusion(double other_occlusion) {
                    this.other_occlusion = other_occlusion;
                }
            }

            public static class GlassBean {
                /**
                 * value : None
                 */

                private String value;

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            public static class SkinstatusBean {
                /**
                 * dark_circle : 3.637
                 * stain : 7.451
                 * acne : 1.113
                 * health : 74.071
                 */

                private double dark_circle;
                private double stain;
                private double acne;
                private double health;

                public double getDark_circle() {
                    return dark_circle;
                }

                public void setDark_circle(double dark_circle) {
                    this.dark_circle = dark_circle;
                }

                public double getStain() {
                    return stain;
                }

                public void setStain(double stain) {
                    this.stain = stain;
                }

                public double getAcne() {
                    return acne;
                }

                public void setAcne(double acne) {
                    this.acne = acne;
                }

                public double getHealth() {
                    return health;
                }

                public void setHealth(double health) {
                    this.health = health;
                }
            }

            public static class HeadposeBean {
                /**
                 * yaw_angle : 5.1354847
                 * pitch_angle : 14.155868
                 * roll_angle : -6.694192
                 */

                private double yaw_angle;
                private double pitch_angle;
                private double roll_angle;

                public double getYaw_angle() {
                    return yaw_angle;
                }

                public void setYaw_angle(double yaw_angle) {
                    this.yaw_angle = yaw_angle;
                }

                public double getPitch_angle() {
                    return pitch_angle;
                }

                public void setPitch_angle(double pitch_angle) {
                    this.pitch_angle = pitch_angle;
                }

                public double getRoll_angle() {
                    return roll_angle;
                }

                public void setRoll_angle(double roll_angle) {
                    this.roll_angle = roll_angle;
                }
            }

            public static class BlurBean {
                /**
                 * blurness : {"threshold":50,"value":0.467}
                 * motionblur : {"threshold":50,"value":0.467}
                 * gaussianblur : {"threshold":50,"value":0.467}
                 */

                private BlurnessBean blurness;
                private MotionblurBean motionblur;
                private GaussianblurBean gaussianblur;

                public BlurnessBean getBlurness() {
                    return blurness;
                }

                public void setBlurness(BlurnessBean blurness) {
                    this.blurness = blurness;
                }

                public MotionblurBean getMotionblur() {
                    return motionblur;
                }

                public void setMotionblur(MotionblurBean motionblur) {
                    this.motionblur = motionblur;
                }

                public GaussianblurBean getGaussianblur() {
                    return gaussianblur;
                }

                public void setGaussianblur(GaussianblurBean gaussianblur) {
                    this.gaussianblur = gaussianblur;
                }

                public static class BlurnessBean {
                    /**
                     * threshold : 50.0
                     * value : 0.467
                     */

                    private double threshold;
                    private double value;

                    public double getThreshold() {
                        return threshold;
                    }

                    public void setThreshold(double threshold) {
                        this.threshold = threshold;
                    }

                    public double getValue() {
                        return value;
                    }

                    public void setValue(double value) {
                        this.value = value;
                    }
                }

                public static class MotionblurBean {
                    /**
                     * threshold : 50.0
                     * value : 0.467
                     */

                    private double threshold;
                    private double value;

                    public double getThreshold() {
                        return threshold;
                    }

                    public void setThreshold(double threshold) {
                        this.threshold = threshold;
                    }

                    public double getValue() {
                        return value;
                    }

                    public void setValue(double value) {
                        this.value = value;
                    }
                }

                public static class GaussianblurBean {
                    /**
                     * threshold : 50.0
                     * value : 0.467
                     */

                    private double threshold;
                    private double value;

                    public double getThreshold() {
                        return threshold;
                    }

                    public void setThreshold(double threshold) {
                        this.threshold = threshold;
                    }

                    public double getValue() {
                        return value;
                    }

                    public void setValue(double value) {
                        this.value = value;
                    }
                }
            }

            public static class SmileBean {
                /**
                 * threshold : 50.0
                 * value : 48.971
                 */

                private double threshold;
                private double value;

                public double getThreshold() {
                    return threshold;
                }

                public void setThreshold(double threshold) {
                    this.threshold = threshold;
                }

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }
            }

            public static class EyestatusBean {
                /**
                 * left_eye_status : {"normal_glass_eye_open":0.008,"no_glass_eye_close":0,"occlusion":0,"no_glass_eye_open":99.992,"normal_glass_eye_close":0,"dark_glasses":0}
                 * right_eye_status : {"normal_glass_eye_open":0.074,"no_glass_eye_close":0,"occlusion":0,"no_glass_eye_open":99.926,"normal_glass_eye_close":0,"dark_glasses":0}
                 */

                private LeftEyeStatusBean left_eye_status;
                private RightEyeStatusBean right_eye_status;

                public LeftEyeStatusBean getLeft_eye_status() {
                    return left_eye_status;
                }

                public void setLeft_eye_status(LeftEyeStatusBean left_eye_status) {
                    this.left_eye_status = left_eye_status;
                }

                public RightEyeStatusBean getRight_eye_status() {
                    return right_eye_status;
                }

                public void setRight_eye_status(RightEyeStatusBean right_eye_status) {
                    this.right_eye_status = right_eye_status;
                }

                public static class LeftEyeStatusBean {
                    /**
                     * normal_glass_eye_open : 0.008
                     * no_glass_eye_close : 0.0
                     * occlusion : 0.0
                     * no_glass_eye_open : 99.992
                     * normal_glass_eye_close : 0.0
                     * dark_glasses : 0.0
                     */

                    private double normal_glass_eye_open;
                    private double no_glass_eye_close;
                    private double occlusion;
                    private double no_glass_eye_open;
                    private double normal_glass_eye_close;
                    private double dark_glasses;

                    public double getNormal_glass_eye_open() {
                        return normal_glass_eye_open;
                    }

                    public void setNormal_glass_eye_open(double normal_glass_eye_open) {
                        this.normal_glass_eye_open = normal_glass_eye_open;
                    }

                    public double getNo_glass_eye_close() {
                        return no_glass_eye_close;
                    }

                    public void setNo_glass_eye_close(double no_glass_eye_close) {
                        this.no_glass_eye_close = no_glass_eye_close;
                    }

                    public double getOcclusion() {
                        return occlusion;
                    }

                    public void setOcclusion(double occlusion) {
                        this.occlusion = occlusion;
                    }

                    public double getNo_glass_eye_open() {
                        return no_glass_eye_open;
                    }

                    public void setNo_glass_eye_open(double no_glass_eye_open) {
                        this.no_glass_eye_open = no_glass_eye_open;
                    }

                    public double getNormal_glass_eye_close() {
                        return normal_glass_eye_close;
                    }

                    public void setNormal_glass_eye_close(double normal_glass_eye_close) {
                        this.normal_glass_eye_close = normal_glass_eye_close;
                    }

                    public double getDark_glasses() {
                        return dark_glasses;
                    }

                    public void setDark_glasses(double dark_glasses) {
                        this.dark_glasses = dark_glasses;
                    }
                }

                public static class RightEyeStatusBean {
                    /**
                     * normal_glass_eye_open : 0.074
                     * no_glass_eye_close : 0.0
                     * occlusion : 0.0
                     * no_glass_eye_open : 99.926
                     * normal_glass_eye_close : 0.0
                     * dark_glasses : 0.0
                     */

                    private double normal_glass_eye_open;
                    private double no_glass_eye_close;
                    private double occlusion;
                    private double no_glass_eye_open;
                    private double normal_glass_eye_close;
                    private double dark_glasses;

                    public double getNormal_glass_eye_open() {
                        return normal_glass_eye_open;
                    }

                    public void setNormal_glass_eye_open(double normal_glass_eye_open) {
                        this.normal_glass_eye_open = normal_glass_eye_open;
                    }

                    public double getNo_glass_eye_close() {
                        return no_glass_eye_close;
                    }

                    public void setNo_glass_eye_close(double no_glass_eye_close) {
                        this.no_glass_eye_close = no_glass_eye_close;
                    }

                    public double getOcclusion() {
                        return occlusion;
                    }

                    public void setOcclusion(double occlusion) {
                        this.occlusion = occlusion;
                    }

                    public double getNo_glass_eye_open() {
                        return no_glass_eye_open;
                    }

                    public void setNo_glass_eye_open(double no_glass_eye_open) {
                        this.no_glass_eye_open = no_glass_eye_open;
                    }

                    public double getNormal_glass_eye_close() {
                        return normal_glass_eye_close;
                    }

                    public void setNormal_glass_eye_close(double normal_glass_eye_close) {
                        this.normal_glass_eye_close = normal_glass_eye_close;
                    }

                    public double getDark_glasses() {
                        return dark_glasses;
                    }

                    public void setDark_glasses(double dark_glasses) {
                        this.dark_glasses = dark_glasses;
                    }
                }
            }

            public static class FacequalityBean {
                /**
                 * threshold : 70.1
                 * value : 82.617
                 */

                private double threshold;
                private double value;

                public double getThreshold() {
                    return threshold;
                }

                public void setThreshold(double threshold) {
                    this.threshold = threshold;
                }

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }
            }

            public static class EthnicityBean {
                /**
                 * value : ASIAN
                 */

                private String value;

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            public static class EyegazeBean {
                /**
                 * right_eye_gaze : {"position_x_coordinate":0.476,"vector_z_component":0.999,"vector_x_component":-0.034,"vector_y_component":-0.02,"position_y_coordinate":0.417}
                 * left_eye_gaze : {"position_x_coordinate":0.541,"vector_z_component":0.986,"vector_x_component":0.101,"vector_y_component":-0.134,"position_y_coordinate":0.397}
                 */

                private RightEyeGazeBean right_eye_gaze;
                private LeftEyeGazeBean left_eye_gaze;

                public RightEyeGazeBean getRight_eye_gaze() {
                    return right_eye_gaze;
                }

                public void setRight_eye_gaze(RightEyeGazeBean right_eye_gaze) {
                    this.right_eye_gaze = right_eye_gaze;
                }

                public LeftEyeGazeBean getLeft_eye_gaze() {
                    return left_eye_gaze;
                }

                public void setLeft_eye_gaze(LeftEyeGazeBean left_eye_gaze) {
                    this.left_eye_gaze = left_eye_gaze;
                }

                public static class RightEyeGazeBean {
                    /**
                     * position_x_coordinate : 0.476
                     * vector_z_component : 0.999
                     * vector_x_component : -0.034
                     * vector_y_component : -0.02
                     * position_y_coordinate : 0.417
                     */

                    private double position_x_coordinate;
                    private double vector_z_component;
                    private double vector_x_component;
                    private double vector_y_component;
                    private double position_y_coordinate;

                    public double getPosition_x_coordinate() {
                        return position_x_coordinate;
                    }

                    public void setPosition_x_coordinate(double position_x_coordinate) {
                        this.position_x_coordinate = position_x_coordinate;
                    }

                    public double getVector_z_component() {
                        return vector_z_component;
                    }

                    public void setVector_z_component(double vector_z_component) {
                        this.vector_z_component = vector_z_component;
                    }

                    public double getVector_x_component() {
                        return vector_x_component;
                    }

                    public void setVector_x_component(double vector_x_component) {
                        this.vector_x_component = vector_x_component;
                    }

                    public double getVector_y_component() {
                        return vector_y_component;
                    }

                    public void setVector_y_component(double vector_y_component) {
                        this.vector_y_component = vector_y_component;
                    }

                    public double getPosition_y_coordinate() {
                        return position_y_coordinate;
                    }

                    public void setPosition_y_coordinate(double position_y_coordinate) {
                        this.position_y_coordinate = position_y_coordinate;
                    }
                }

                public static class LeftEyeGazeBean {
                    /**
                     * position_x_coordinate : 0.541
                     * vector_z_component : 0.986
                     * vector_x_component : 0.101
                     * vector_y_component : -0.134
                     * position_y_coordinate : 0.397
                     */

                    private double position_x_coordinate;
                    private double vector_z_component;
                    private double vector_x_component;
                    private double vector_y_component;
                    private double position_y_coordinate;

                    public double getPosition_x_coordinate() {
                        return position_x_coordinate;
                    }

                    public void setPosition_x_coordinate(double position_x_coordinate) {
                        this.position_x_coordinate = position_x_coordinate;
                    }

                    public double getVector_z_component() {
                        return vector_z_component;
                    }

                    public void setVector_z_component(double vector_z_component) {
                        this.vector_z_component = vector_z_component;
                    }

                    public double getVector_x_component() {
                        return vector_x_component;
                    }

                    public void setVector_x_component(double vector_x_component) {
                        this.vector_x_component = vector_x_component;
                    }

                    public double getVector_y_component() {
                        return vector_y_component;
                    }

                    public void setVector_y_component(double vector_y_component) {
                        this.vector_y_component = vector_y_component;
                    }

                    public double getPosition_y_coordinate() {
                        return position_y_coordinate;
                    }

                    public void setPosition_y_coordinate(double position_y_coordinate) {
                        this.position_y_coordinate = position_y_coordinate;
                    }
                }
            }
        }

        public static class FaceRectangleBean {
            /**
             * width : 79
             * top : 103
             * left : 52
             * height : 79
             */

            private int width;
            private int top;
            private int left;
            private int height;

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getTop() {
                return top;
            }

            public void setTop(int top) {
                this.top = top;
            }

            public int getLeft() {
                return left;
            }

            public void setLeft(int left) {
                this.left = left;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }
        }
    }
}
