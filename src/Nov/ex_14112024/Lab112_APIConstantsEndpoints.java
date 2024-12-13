package Nov.ex_14112024;


public enum Lab112_APIConstantsEndpoints {

        BASE_URL("https://app.vwo.com"),
        LOGIN_PAGE("https://app.vwo.com/login"),
        DASHBOARD_PAGE("https://app.vwo.com/dasHboard"),
        CHATBOT_PAGE("https://app.vwo.com/chat");




        private String name;

        Lab112_APIConstantsEndpoints(String name)
        {
            this.name =  name;
        }



        String getValue() {
            return name;
        }



}
