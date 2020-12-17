package com.example.day12_17lianxi.bean;

import java.io.Serializable;
import java.util.List;

public class GirlsBean {
    /**
     * data : [{"_id":"5e958ee017bf93950887f208","author":"鸢媛","category":"Girl","createdAt":"2020-04-15 08:00:00","desc":"愿所期之事皆能成，所念之人皆能到。 ","images":["http://gank.io/images/28fc02e86d584ff08802c8dcd9535b35"],"likeCounts":0,"publishedAt":"2020-04-15 08:00:00","stars":1,"title":"第56期","type":"Girl","url":"http://gank.io/images/28fc02e86d584ff08802c8dcd9535b35","views":734},{"_id":"5e958ec30bd5529b54e7129c","author":"鸢媛","category":"Girl","createdAt":"2020-04-14 08:00:00","desc":"如果一段感情， 没能把你变成更好的人， 只是让你患得患失 喜怒无常， 那真遗憾 你爱错了人。","images":["http://gank.io/images/8a9837115fb64d22b0484e3d4c4cab50"],"likeCounts":1,"publishedAt":"2020-04-14 08:00:00","stars":1,"title":"第55期","type":"Girl","url":"http://gank.io/images/8a9837115fb64d22b0484e3d4c4cab50","views":805},{"_id":"5e8c80cb31ec89ebfc601f12","author":"鸢媛","category":"Girl","createdAt":"2020-04-13 08:00:00","desc":"\u201c 再等一下，上帝肯定会把最特别的你，送给一个最爱你且最特别的人。\u201d \u200b\u200b\u200b\u200b","images":["http://gank.io/images/5888858f49bd4608b12633115687ddc3"],"likeCounts":1,"publishedAt":"2020-04-13 08:00:00","stars":1,"title":"第54期","type":"Girl","url":"http://gank.io/images/5888858f49bd4608b12633115687ddc3","views":787},{"_id":"5e8c80bb31ec89ebfc601f10","author":"鸢媛","category":"Girl","createdAt":"2020-04-12 08:00:00","desc":"你能看见山，看见海，看见这世上的一切，我目光短浅，只能看到你。","images":["http://gank.io/images/65c8ea426cc7423987692872968c25b9"],"likeCounts":0,"publishedAt":"2020-04-12 08:00:00","stars":1,"title":"第53期","type":"Girl","url":"http://gank.io/images/65c8ea426cc7423987692872968c25b9","views":634},{"_id":"5e8c80ae2bce50b3ceaa80f0","author":"鸢媛","category":"Girl","createdAt":"2020-04-11 08:00:00","desc":"我没那么坚强，只是习惯了什么事都自己扛。 \u200b\u200b\u200b\u200b","images":["http://gank.io/images/1c5cebd307fd49eaa75b368b11118b61"],"likeCounts":0,"publishedAt":"2020-04-11 08:00:00","stars":1,"title":"第52期","type":"Girl","url":"http://gank.io/images/1c5cebd307fd49eaa75b368b11118b61","views":615},{"_id":"5e8c80a22bce50b3ceaa80ee","author":"鸢媛","category":"Girl","createdAt":"2020-04-10 08:00:00","desc":"以前总以为，人生最美好的是相遇。后来才明白，其实难得的是重逢。如果说相遇是久别重逢，希望我们别来无恙。","images":["http://gank.io/images/6368ae2770414162819aba90f251cf08"],"likeCounts":0,"publishedAt":"2020-04-10 08:00:00","stars":1,"title":"第51期","type":"Girl","url":"http://gank.io/images/6368ae2770414162819aba90f251cf08","views":658},{"_id":"5e8c808e31ec89ebfc601f0f","author":"鸢媛","category":"Girl","createdAt":"2020-04-09 08:00:00","desc":"希望你以后喜欢的人， 不会让你哭不会让你受委屈 不会不理你更不会放弃你 最好一直陪着你，保护你 最重要的是深深的无可救药的喜欢你。","images":["http://gank.io/images/e831e004436f4fffb657a77aef48b9ca"],"likeCounts":1,"publishedAt":"2020-04-09 08:00:00","stars":1,"title":"第50期","type":"Girl","url":"http://gank.io/images/e831e004436f4fffb657a77aef48b9ca","views":718},{"_id":"5e8c808131ec89ebfc601f0e","author":"鸢媛","category":"Girl","createdAt":"2020-04-08 08:00:00","desc":"不管世界怎么糟糕都好， 我只希望你可以不要被打扰到， 我希望你的路途都繁花似锦， 你依旧是那个十几岁快乐无比的你。","images":["http://gank.io/images/6f1708af33d647f3809ea551e18894ce"],"likeCounts":0,"publishedAt":"2020-04-08 08:00:00","stars":1,"title":"第49期","type":"Girl","url":"http://gank.io/images/6f1708af33d647f3809ea551e18894ce","views":904},{"_id":"5e8c80682bce50b3ceaa80ea","author":"鸢媛","category":"Girl","createdAt":"2020-04-07 08:00:00","desc":"当你越来越优秀的时候，就会遇见越来越好的人。","images":["http://gank.io/images/341ecaacdd7d4cc09cd0de100f3eab46"],"likeCounts":0,"publishedAt":"2020-04-07 08:00:00","stars":1,"title":"第48期","type":"Girl","url":"http://gank.io/images/341ecaacdd7d4cc09cd0de100f3eab46","views":750},{"_id":"5e8c804c3f6af49cb7780b2b","author":"鸢媛","category":"Girl","createdAt":"2020-04-06 08:00:00","desc":"爱就是，我以为我要变得足够好才能遇见你，却发现原来是遇见了你，我才变成一个最好的我。","images":["http://gank.io/images/7878d08eb776401a85deeb203372665c"],"likeCounts":0,"publishedAt":"2020-04-06 08:00:00","stars":1,"title":"第47期","type":"Girl","url":"http://gank.io/images/7878d08eb776401a85deeb203372665c","views":757}]
     * page : 5
     * page_count : 10
     * status : 100
     * total_counts : 96
     */

    private int page;
    private int page_count;
    private int status;
    private int total_counts;
    private List<DataBean> data;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage_count() {
        return page_count;
    }

    public void setPage_count(int page_count) {
        this.page_count = page_count;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getTotal_counts() {
        return total_counts;
    }

    public void setTotal_counts(int total_counts) {
        this.total_counts = total_counts;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        /**
         * _id : 5e958ee017bf93950887f208
         * author : 鸢媛
         * category : Girl
         * createdAt : 2020-04-15 08:00:00
         * desc : 愿所期之事皆能成，所念之人皆能到。
         * images : ["http://gank.io/images/28fc02e86d584ff08802c8dcd9535b35"]
         * likeCounts : 0
         * publishedAt : 2020-04-15 08:00:00
         * stars : 1
         * title : 第56期
         * type : Girl
         * url : http://gank.io/images/28fc02e86d584ff08802c8dcd9535b35
         * views : 734
         */

        private String _id;
        private String author;
        private String category;
        private String createdAt;
        private String desc;
        private int likeCounts;
        private String publishedAt;
        private int stars;
        private String title;
        private String type;
        private String url;
        private int views;
        private List<String> images;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public int getLikeCounts() {
            return likeCounts;
        }

        public void setLikeCounts(int likeCounts) {
            this.likeCounts = likeCounts;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public int getStars() {
            return stars;
        }

        public void setStars(int stars) {
            this.stars = stars;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getViews() {
            return views;
        }

        public void setViews(int views) {
            this.views = views;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }
}
