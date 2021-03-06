package com.example.coviam.myapp.Model;

    import com.google.gson.annotations.SerializedName;

    public class DelRequestModel {
        @SerializedName("cartid")
        private Long cartid;
        @SerializedName("pid")
        private Long pid;
        @SerializedName("mid")
        private Long mid;

        public DelRequestModel(Long cartid, Long pid, Long mid) {
            this.cartid = cartid;
            this.pid = pid;
            this.mid = mid;
        }

        public Long getCartid() {
            return cartid;
        }

        public void setCartid(Long cartid) {
            this.cartid = cartid;
        }

        public Long getPid() {
            return pid;
        }

        public void setPid(Long pid) {
            this.pid = pid;
        }

        public Long getMid() {
            return mid;
        }

        public void setMid(Long mid) {
            this.mid = mid;
        }
    }

