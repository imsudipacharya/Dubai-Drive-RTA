package com.bma.dubailicense;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ImageView;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.squareup.picasso.Picasso;
import com.bma.dubailicense.R;

public class Signs extends AppCompatActivity {
private Toolbar toolbar;
private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signs);

        AudienceNetworkAds.initialize(this);
        mInterstitialAd = new InterstitialAd(this, "807461976663649_807468556662991");
        mInterstitialAd.loadAd();


        ImageView image1 = findViewById(R.id.image1);
        Picasso.get().load(  "https://lh3.googleusercontent.com/9O7bDqMuBnFNulXsz0eHgE19RzLFBMD-wvZ9r-oH3FdWtYZNxx9-iXxx7hEH81MR9_4087TZwG0kpDG1-h9YUniRyxhqRazWXzxrCpfG32Veji-AeEpsAtpbb6DY4OaxQapK-FjAtg=w1920-h1080"
        ).into(image1);

        ImageView image2 = findViewById(R.id.image2);
        Picasso.get().load(  "https://lh3.googleusercontent.com/ksJJVubJSdiFkvE7d0I1KFhY2c_Awz7PMBPwfiCwKXWj5LI8uX5GGafbzCQaBFASJeYIn_kpFc6vUU-CDXnl5nn1BpFmLYqMX6ax5BCzjyF-t7qzRxpMz9QtJ1Q9lFQFZpuF5gvn6g=w1920-h1080"
        ).into(image2);

        ImageView image3 = findViewById(R.id.image3);
        Picasso.get().load(  "https://lh3.googleusercontent.com/NzgnVTthHwZvt7CmErTWXiC2DKx1jNUErHyxbLILaoghv_bQO5rux75Ocz0BTNEN2VMLUrAp1zerdZyS5_n73mcTs0VIkJ8MXH_GpjHK2IWEixbTAZJijlD2I6FDRfOD9xtCaN20yg=w1920-h1080"
        ).into(image3);

        ImageView image4 = findViewById(R.id.image4);
        Picasso.get().load(  "https://lh3.googleusercontent.com/5D_mVyR_qZcs5rcKCPKGIZXQ1iAdt2KkGcBgzgLPJT4LK5ufOnWeN5Nt1jAD6yRKdJoKHbduJeg3dKw-yKsydXj5bjLk7PpsbupItCobYRDwt-yIoP3ZiZ0r16YjiLMcI9spwbdJfw=w1920-h1080"
        ).into(image4);

        ImageView image5 = findViewById(R.id.image5);
        Picasso.get().load(  "https://lh3.googleusercontent.com/xQUVXWTeIjcjx9OkXwQFcCWNqw5PE-1JwmRgDuC4hLynYrJURGO79u_neToSOz23KoynGht7gHGD4UH05KmUaB6LrHJVXRPHjg2S7KnsJaYo4Ph2id9YIKwWLL-aAek-b9uMlTzdNQ=w1920-h1080"
        ).into(image5);

        ImageView image6 = findViewById(R.id.image6);
        Picasso.get().load(  "https://lh3.googleusercontent.com/rBGcybwu87JxLia8AFKlJFlaxWe70bG10oc9U6pLbtB-iEY6DLiJbBump9F4By46oqm5mmdZMIs-fGOYIf540ao1iej_EEbrK-nSbpJdhRoZ7Iz3eciqPVcOVj1WA3bZGDETwU4BGw=w1920-h1080"
        ).into(image6);

        ImageView image7 = findViewById(R.id.image7);
        Picasso.get().load(  "https://lh3.googleusercontent.com/BLT6RhMKfdrI27Ds0vw4UGBpVWVfJtB-wvfvZYIucpkEyyjcgTVNjhWI0ASTEg9qTbPswD7yso_FIQLIVvk6FbdyKhGjb61E3EFEn9zVxI2ToGGjf_aG2P3i4DwRK2UtgEuqonmScA=w1920-h1080"
        ).into(image7);

        ImageView image8 = findViewById(R.id.image8);
        Picasso.get().load(  "https://lh3.googleusercontent.com/q_UWbsqUfxJnbIexaud5kQ816N5sTe4IeTxCM-F39MKsPrMxya7c-AXYr4TnT9GZQDKE8X8gz72EKuMvr8VmgwbmC8rlj5O3XtJd74SrFW7Ql_2Mu04WohAXZn6QeYDoDh-tgc3bDA=w1920-h1080"
        ).into(image8);

        ImageView image9 = findViewById(R.id.image9);
        Picasso.get().load(  "https://lh3.googleusercontent.com/MBXjLvJcZrDSXCjr0Xx-U6TcASDTteKTIkUO7vY8pPQtBiqSQwlPv7SLhKQ3p3OlPmPYd9g9cxurWL08fD2V_extKd3gMWpMNwlOVb0fHKMIvCJdc4cmgD23s7pcIEPZx5DFagy00A=w1920-h1080"
        ).into(image9);

        ImageView image10 = findViewById(R.id.image10);
        Picasso.get().load(  "https://lh3.googleusercontent.com/RSit8N5f3fVwT8GzQva3u_YJBcIDGxkeS9n-7Uvn807kG0FVI0oasoAc9Ze85WOFVGcDIlBG0OqWVVL9J4zIN9oYHlxwTV2XFvkO04qfKPAhIWYltNC9PEhqAgmFVMov4NqTKZiYQg=w1920-h1080"
        ).into(image10);

        ImageView image11 = findViewById(R.id.image11);
        Picasso.get().load(  "https://lh3.googleusercontent.com/DLkuDPHJPNRQ9xoFPfm9yBmFA8_N-HnoXzStMi02eKfALhgFstsX6-cJ93ZV8_qHHnMu05YhtOzRBA6FWB_Vh_RoedOALQVjI_cX0WbRPm_2Yl72zLuGDHpYixXImrKW3DN170RTOg=w1920-h1080"
        ).into(image11);

        ImageView image12 = findViewById(R.id.image12);
        Picasso.get().load(  "https://lh3.googleusercontent.com/a0xlkjPgRIvtsOKBvFde3Z5R7W_bpr46Oatdn2VwA7vvA-WRRqSHMhiOtht4BY8ZL2eSD_1dTnC3-QG9GQCcm9Q8ScKKovwSac0kmvEDuPaLSSnSL649SCjx3ExBtR9pGKtt-5IFcg=w1920-h1080"
        ).into(image12);

        ImageView image13 = findViewById(R.id.image13);
        Picasso.get().load(  "https://lh3.googleusercontent.com/dHoWLQXgf52xWnvejqtbe0Eq3GeecxSTYg9roLgJJ_ciwEkK6200S0jHbKyt_JfQ2Qb4z-mJh5m-n6o6cULBJ9GfX4nUqFcPH3DuZps8OYrsblE0lsGhzRUm1uarNbQzshl0KYNztw=w1920-h1080"
        ).into(image13);

        ImageView image14 = findViewById(R.id.image14);
        Picasso.get().load(  "https://lh3.googleusercontent.com/H7sYLUZhH9-6sOaSQ1rUqsfGB8PzPa7vzOuYiZocd-bA-l2L7xvqbp9Nr6Uc3RDiqIh3wimPV93mkcgpmasIECO1820fYkEa3rniCSh8KEoqn_XszHxyFNPzmMeei69F2YXHyd_ZWw=w1920-h1080"
        ).into(image14);

        ImageView image15 = findViewById(R.id.image15);
        Picasso.get().load(  "https://lh3.googleusercontent.com/4Tjn0mYGXjh33FblJZWlJnUztNEz5Nfdr9MPWYpnQl39Wce6k26E951PfV-8b2JhZqMWUDO36YUf28DUKtFn9oo7cvIs9FNKxImdOvmZhLsLVcQofCYooqzafZye4e_nJd0FFD-9Cw=w1920-h1080"
        ).into(image15);

        ImageView image16 = findViewById(R.id.image16);
        Picasso.get().load(  "https://lh3.googleusercontent.com/F-WWjOmhdOwskEgYVzb-VCXR58GJJbCkYBAypQKam8tzLvXzOGZ0N4KABeIDqcb0QFrx_9DYTUji8uPndrTlv4Qq5h-k5UGqfeZ9iQwUahtQ9XdtlKbEvzuxdttu2zWZwstymK6ygA=w1920-h1080"
        ).into(image16);

        ImageView image17 = findViewById(R.id.image17);
        Picasso.get().load(  "https://lh3.googleusercontent.com/izFSKnomWTfN8bbOFtSvvAQuGxhYTcqE3_VhP1gSCvAzNpeT5QW_t89trj9QeLa3-geovCUa1NHsqGqD02n144K46eoen4youWvknDr1X36MfTrQXjJMYYtmah-vBdooJG_b7WNrpw=w1920-h1080"
        ).into(image17);

        ImageView image18 = findViewById(R.id.image18);
        Picasso.get().load(  "https://lh3.googleusercontent.com/kH5EFX9Op10SMC2oxuGl8BOqXxbRVLcSEjxLAysfoS2N8DFuHFwAO02zvCxGgXfqlHkAGX4NEVX7VaA_HOrWw_KsHmVwTR_Wk5LunX254yHXX-4wl6_-9Q53LZka6mDy--O4z8JyGQ=w1920-h1080"
        ).into(image18);

        ImageView image19 = findViewById(R.id.image19);
        Picasso.get().load(  "https://lh3.googleusercontent.com/V75E41gfJ-7faGDgBSLLD7jHVIs351bX8z6NVA686EEOCtUx0Pajdvr_Q2429sthwIRrWb8VXXH65cXYY_rNn519HTqTAvWpuPxnYOTyxdXgKhCTNsC7oj0uetKyZW4WuIi-yUlT9g=w1920-h1080"
        ).into(image19);

        ImageView image20 = findViewById(R.id.image20);
        Picasso.get().load(  "https://lh3.googleusercontent.com/EkyIF0xifzztZNhiNjATx1Z5VO6dGKyff4UMJgLrLsGEC3n1uFZSiskHA0De_CSmOQRwckIw8kYXuXizTD4VBMK55SmOa0-ZbGNmJA1I54yJ1qGvFg4P5sSh-dk0c4ZHKd4KUUzZBA=w1920-h1080"
        ).into(image20);

        ImageView image21 = findViewById(R.id.image21);
        Picasso.get().load(  "https://lh3.googleusercontent.com/chFC9tdmZf_uP_TeYBjFmbjRUZo5gInvtNTVWSGQKH-4jliIexbLsy1Ib-HRGSfzVEaMmKBu5dIVFScYA5YuS_7dl7V_6zPvpDBdDG74uUKY7TObYtSNQ7EK0HW96E0yZYSW-wbk-g=w1920-h1080"
        ).into(image21);

        ImageView image22 = findViewById(R.id.image22);
        Picasso.get().load(  "https://lh3.googleusercontent.com/EfHXrPnLXO753Ox5Hbg1ocDN2SL1y0WupBWxkeSAnbay-pJKVBEkznibrx4cBy4UtTfKm3Y85c8xCLw-JPaf3j0HzFxROfsLorF4IWWcwVza5IbSdc1e5JkxhAr89wNa45Vvh4WU1A=w1920-h1080"
        ).into(image22);

        ImageView image23 = findViewById(R.id.image23);
        Picasso.get().load(  "https://lh3.googleusercontent.com/Qk70UWj8rV5a-aP9GK9L2SRy59bZBQEwTJMavYDGb6wxRSeu-qsTYmSCKDt7qFmLUv6LEnkhElfY6jYGXPD2tMd-yE_hsJqEyzqOBE2a1g0tSTnFO7Ptodqi8XQIi8RNzIgkr3S-rQ=w1920-h1080"
        ).into(image23);

        ImageView image24 = findViewById(R.id.image24);
        Picasso.get().load(  "https://lh3.googleusercontent.com/jd6gB1_tORPgWe7h3E300nOaVFrfgVRsHCCfi-jqAySlvuL3_tweviEHW6blf0tChuzzBxS5gMgugAU33WQ1QUIQuVJeOj52nhDPuBNXlSVg_7v3vYG7NPmAQzq4LRBgIAOIQ9bMxA=w1920-h1080"
        ).into(image24);

        ImageView image25 = findViewById(R.id.image25);
        Picasso.get().load(  "https://lh3.googleusercontent.com/6ksCa0uanf6sQYJgdQxUTj-EP4JiPoqXNwvZGJUaVAYpogFFbggNfsvGh3_fz04ps_AVJEeP7bOUhvZGp2eu3xFAatfBevw4nM-6UjiRjv2ao-VLY1FwK1lOSJ7lDZX7_MKcPpYM0w=w1920-h1080"
        ).into(image25);

        ImageView image26 = findViewById(R.id.image26);
        Picasso.get().load(  "https://lh3.googleusercontent.com/euf9JROl-ObDd0dwuCH-QrQsTOImrQsDb2guKapAIjdQ5saWqtzFQZClxir-eAYeNekpZNps9pMLOhMyRPpPkPpw3ywLZrhWvbaO5_CdVcIr-FgKnkaeIJ9mE27nsklh-16ooywzSQ=w1920-h1080"
        ).into(image26);

        ImageView image27 = findViewById(R.id.image27);
        Picasso.get().load(  "https://lh3.googleusercontent.com/nB5stR0F0hspWgcRkSWHAwA49PvOwRj8iGij6yivJQAZM6joQXS1SLeH84RK51Ejclg5hIjeqj4Y_VtdL0jZw7jQfO1DAXQbkGprCMdKWEFeZsGP5tGOrhG_MVKgGm-5LcrmrydAEw=w1920-h1080"
        ).into(image27);

        ImageView image28 = findViewById(R.id.image28);
        Picasso.get().load(  "https://lh3.googleusercontent.com/SKnajgKBIUyyFqCATwHn_cMOPioTMYS-xxnt6CHqQi_0x7rVz0Rusg_TQ_jZexf7zR6yVIquGxAmxDmlzlj6QfKLShpZFlOkXcDM2tioyDonexQW83JOVfNQGuduhfQHhOU4lSK7hw=w1920-h1080"
        ).into(image28);

        ImageView image29 = findViewById(R.id.image29);
        Picasso.get().load(  "https://lh3.googleusercontent.com/RNEcKksQkQy2PRfPKIX1QihOHKmdENMapE1pUJjgfDpXiaNtBIrUrtZtH_r5KzDgb9c8C6uQjuW2mtYFWlVxa1eVCvtis-SNl0rbnRBtD8lsUBh55b2_g3lZZWsCuRfDdmV1ovnVVA=w1920-h1080"
        ).into(image29);

        ImageView image30 = findViewById(R.id.image30);
        Picasso.get().load(  "https://lh3.googleusercontent.com/kE2P6ZXtVRo8yCU4L4659uw-tC6u4wKTLkIGP9O92Mg_VIV86yb6BR49pm7ErK25qbasKOxMpxlXfcXOhfcqRlFLNH2j2OrsBjkYy4t00goo9iPJzYWD3P4pI3jv1JtOWZ7i0_cIdQ=w1920-h1080"
        ).into(image30);

        ImageView image31 = findViewById(R.id.image31);
        Picasso.get().load(  "https://lh3.googleusercontent.com/EHl7Ma6NkGzN-tIboKX1TsO3ML-eA6OF_fMhk60TBWpeNk7im2jH4-6ycqpLfaI2At9KM_a_yesqxJnOuJJRNTQVG30GIOgJsaDB9iHJTGRYACp8Eo0SCjAp3jijBKplDcNrOPBYgQ=w1920-h1080"
        ).into(image31);

        ImageView image32 = findViewById(R.id.image32);
        Picasso.get().load(  "https://lh3.googleusercontent.com/hgxJ0H_feUakLp8hv3d7IukAX466t13ywpzI2Du5xZUo84zxU6xXNXT9SC_c_gKFaXDGOMOQbAfItB6auf-mink5EFM30inNR6-8qoje0PWIJJ0RgfEELKVqZQ_uuVZqT9uoGZ4XAA=w1920-h1080"
        ).into(image32);

        ImageView image33 = findViewById(R.id.image33);
        Picasso.get().load(  "https://lh3.googleusercontent.com/MgXzshN1gEhvxUpgnoFxycatjfhR6A97nefxscUYK-Nqj4NJuQ_KllhG9aEYw-lvidRwHkwZDuAwuJyIXjXMo2zu39HUCFIPWzrdxbj35cL-eejmNpZRYDKqwj_mTMIqJ34-J3uixw=w1920-h1080"
        ).into(image33);

        ImageView image34 = findViewById(R.id.image34);
        Picasso.get().load(  "https://lh3.googleusercontent.com/qWOetWDRFa-MI1zjk6F-5vXMwGKht-g8XFaQz-etW5bexpNEtHEW9DHV-EwzlRvKs6bw2dqqPMbq2yB6xHzogsZZpcUGMi9fLPhVTut4qV3VvcFIy9YL_oeQF4f3HTL5SFX2XwLz7w=w1920-h1080"
        ).into(image34);

        ImageView image35 = findViewById(R.id.image35);
        Picasso.get().load(  "https://lh3.googleusercontent.com/QEJX5BuaZ7nHLfVqCCkdws3nxQuDZD2uRd6V610eQpfcO8R3D2ZcUUtC3d4jCGrDs46-QsvBweniFFVCXymzpEA8zSb01m3PWcP4-U0n9e4cgDwt5jzuqlyIfyLV58SXXMffnttIqw=w1920-h1080"
        ).into(image35);

        ImageView image36 = findViewById(R.id.image36);
        Picasso.get().load(  "https://lh3.googleusercontent.com/eSf0ZJDeyTv30ZuVSsSh6jl0kQ2xpKagaG_bt5bRzoitysQXbqcclnmVNOOzyBg47qf6KJNLPubL0ObMTWZ4ExsSxqX7fwm6PpWRppK5vhXZXs9vGDXVAuC0Mue0ZSzykYZMQcSg_w=w1920-h1080"
        ).into(image36);

        ImageView image37 = findViewById(R.id.image37);
        Picasso.get().load(  "https://lh3.googleusercontent.com/WsKD1Kme-sJteJ_y4ZXbfJ_9gSOp90UvzZ-g-H2M_BtAztYLldXT9YkoTKEtpf-iP6v5_1xa17hlmZgh65wIegdr1CvskcPbkEjI2eIUEBEVRERYWBrj1fz_N0TBwkfrCsM4Fm2HTA=w1920-h1080"
        ).into(image37);

        ImageView image38 = findViewById(R.id.image38);
        Picasso.get().load(  "https://lh3.googleusercontent.com/iMwte6AzgZAgYEZUaRlVDX7yq6iWI_U28ZnznCFpo3YQtR7plDmBIFlEzeYn776G7cFBv-1_W7pdXo4Y63kXn72ECyWm-LA1eqbU34msCfOh3GNAgsPDKzZEZc8cNtyUXoXn5MYApw=w1920-h1080"
        ).into(image38);

        ImageView image39 = findViewById(R.id.image39);
        Picasso.get().load(  "https://lh3.googleusercontent.com/qZDnrcip24O0DbWcN8m4E6FrI-uyZ5wPo37t5MYVDz8KQYgNaKdHCsS7eHdfiBC3qdUe0w6GKj6oUT_40yCXpSjR8ERrNtOnfHfnAEnx4GQPdsBt1VpbRXoHr3xxhS6_B2ehwd4YkA=w1920-h1080"
        ).into(image39);

        ImageView image40 = findViewById(R.id.image40);
        Picasso.get().load(  "https://lh3.googleusercontent.com/KVqXJ2zpn4kd2B7700576EH34JyotnvlTYmnKyFWS2Rf84b92UhGvsNIWdPsd0WDIzp6sOM59YHgxR1qxk0-Jd4ZeEyuw6Z8F0pgl0jzybzOlzYZKpewzKvnRJ0R9Z2_YCAsp_V5cQ=w1920-h1080"
        ).into(image40);

        ImageView image41 = findViewById(R.id.image41);
        Picasso.get().load(  "https://lh3.googleusercontent.com/o9OddEjCt08j4W_q2CtSQPjW4z65pyQbS9VxPcyn08_VCxFRKYSp5_qROBCnjMcWNW4DQzG3nPWaSusCnf0PUqW4-DlI5CXF5kcuoA0MiiVHD7jcWPJjFbSlSCcFrShfT46oGyDq1A=w1920-h1080"
        ).into(image41);

        ImageView image42 = findViewById(R.id.image42);
        Picasso.get().load(  "https://lh3.googleusercontent.com/cFcw4B3UNp65CVE3xVM54btu2yL9FVQyQ6mi958V-4m3s1hQQu4p--l2XUWn85iWs6Ywsu4BAkP9MlYr4RA_JZU6NEMD3W05dbPTx2Ok_VRHcFNgU5upBaayqnWq0kTrvfjRLOuJ4Q=w1920-h1080"
        ).into(image42);

        ImageView image43 = findViewById(R.id.image43);
        Picasso.get().load(  "https://lh3.googleusercontent.com/tYV757svoZ0Ghr84yR1UyDme_I8XZia8B8-dBRQEGpD0NMfWVwmeMkOcF-9kkfcVqMkmKR3XLxvH3H_zLgKaikaev1Hlx7Bzz-kfDjOUPMJqjAuc0kjNcZUY9oaIidC8X8KGfyKOog=w1920-h1080"
        ).into(image43);

        ImageView image44 = findViewById(R.id.image44);
        Picasso.get().load(  "https://lh3.googleusercontent.com/CFaAEDAoRl2ObR5XMRNA_CLRDwIBJ15BsesI-D8Zr9BhQ2ZF36zqcPBDVeFj2JiIalpkz503dgrmxvKXy8tC7JwqEpBPQjXGlr-gyz_xkc_-ipiDbh7Tfi0M-li8DxwkoHHEE15kGA=w1920-h1080"
        ).into(image44);

        ImageView image45 = findViewById(R.id.image45);
        Picasso.get().load(  "https://lh3.googleusercontent.com/VCYyc4rBnjSFOb4hcmrPvLHyoAMa-mBJ36iHEWWegRIh-8R4oCLK5VsbvRqa34kztrh9ftLkOUq6zOSRGVJfayiJDeEIaHFRh9110ZObgfik-Y3zzs9Ekd6c54k-aiEw17TdvtsHAw=w1920-h1080").into(image45);


    }

    @Override
    public void onBackPressed() {
        if (mInterstitialAd.isAdLoaded()) {

            mInterstitialAd.show();
        } else {
            super.onBackPressed();
        }
    }
}