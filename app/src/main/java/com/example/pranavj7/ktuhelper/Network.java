package com.example.pranavj7.ktuhelper;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Created by pranavj7 on 9/14/2016.
 */
public class Network extends s3s4 {
    static String act = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (net == "cs") {
            setContentView(R.layout.s3s4cs);
        } else if (net == "ce") {
            setContentView(R.layout.s3s4ce);
        } else if (net == "me") {
            setContentView(R.layout.s3s4me);
        } else if (net == "ee") {
            setContentView(R.layout.s3s4ee);
        } else if (net == "ec") {
            setContentView(R.layout.s3s4ec);
        }
        Toolbar mToolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    /*************************************************SEMESTER-3*********************************/

    /**  S3 common syllabus for all branches-------------------------------------------------------------- */

    public void business(View view){
        act="busi";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.business);
        startActivity(intent);
    }
    public void lac(View view) {
        act = "lac";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.LAC);
        startActivity(intent);
    }

    /**  syllabus for computer science----------------------------------------------------------------------- */
    public void ds(View view) {
        act = "ds";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.DS);
        startActivity(intent);
    }

    public void dcs(View view) {
        act = "dcs";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.DCS);
        startActivity(intent);
    }

    public void stld(View view) {
        act = "stld";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.STLD);
        startActivity(intent);
    }

    public void edc(View view) {
        act = "edc";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.EDC);
        startActivity(intent);
    }

    public void dslab(View view) {
        act = "dsl";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.dslab);
        startActivity(intent);
    }

    public void edclab(View view) {
        act = "edcl";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.edclab);
        startActivity(intent);
    }
/** syllabus for civil dep--------------------------------------------------------------------------*/

    public void enggeo(View view) {
        act = "enggeo";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.enggeo);
        startActivity(intent);
    }

    public void survey(View view) {
        act = "survey";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.survey);
        startActivity(intent);
    }


    public void solids(View view) {
        act = "solids";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.solid);
        startActivity(intent);
    }

    public void mech1(View view) {
        act = "mech1";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.mech1);
        startActivity(intent);
    }

    public void draft(View view) {
        act = "draftl";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.draftlab);
        startActivity(intent);
    }

    public void surveylab(View view) {
        act = "surveryl";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.surveylab);
        startActivity(intent);
    }

    /** syllabus for electrical and electronics dep --------------------------------------------------*/

    public void can(View view) {
        act = "can";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.CAN);
        startActivity(intent);
    }

    public void aec(View view) {
        act = "aec";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.AEC);
        startActivity(intent);
    }

    public void dcm(View view) {
        act = "dcm";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.DCMT);
        startActivity(intent);
    }

    public void cpm(View view) {
        act = "cpm";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.CP);
        startActivity(intent);
    }
    public void eeecl(View view){
        act="eeecl";
        Intent intent = new Intent(Network.this,DetailActivity.class);
        intent.putExtra("name", R.string.eecla);
        startActivity(intent);
    }
    public void cpl(View view){
        act="cpl";
        Intent intent = new Intent(Network.this,DetailActivity.class);
        intent.putExtra("name", R.string.cpl);
        startActivity(intent);
    }
    /** syllabus for electronics and communication dep
     * syllabus for electronics and communication dep ------------------------------------------------------------*/

    public void net(View view) {
        act = "net";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.netwrk);
        startActivity(intent);
    }

    public void sd(View view) {
        act = "sd";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.solidstate);
        startActivity(intent);
    }

    public void ecirc(View view) {
        act = "ecirc";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.ecc);
        startActivity(intent);
    }

    public void lcd(View view) {
        act = "lcd";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.lcd);
        startActivity(intent);
    }
    public void ecedcl(View view){
        act="ecedcl";
        Intent intent = new Intent(Network.this,DetailActivity.class);
        intent.putExtra("name", R.string.ecedcl);
        startActivity(intent);
    }
    public void edal(View view){
        act="edal";
        Intent intent = new Intent(Network.this,DetailActivity.class);
        intent.putExtra("name", R.string.edal);
        startActivity(intent);
    }
/** syllabus for mechanical branch-----------------------------------------------------------------------------*/

public void mes(View view) {
    act = "mes";
    Intent intent = new Intent(Network.this, DetailActivity.class);
    intent.putExtra("name", R.string.mesolid);
    startActivity(intent);
}

    public void mef(View view) {
        act = "mef";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.mefluid);
        startActivity(intent);
    }

    public void thermo(View view) {
        act = "thermo";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.thermo);
        startActivity(intent);
    }

    public void metal(View view) {
        act = "metal";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.metal);
        startActivity(intent);
    }
    public void cad(View view){
        act="cad";
        Intent intent = new Intent(Network.this,DetailActivity.class);
        intent.putExtra("name", R.string.CAD);
        startActivity(intent);
    }
    public void Material(View view){
        act="material";
        Intent intent = new Intent(Network.this,DetailActivity.class);
        intent.putExtra("name", R.string.edal);
        startActivity(intent);
    }
    /*************************************************SEMESTER-4******************************************************************/


    /**  S4 common syllabus for all branches-------------------------------------------------------------- */

    public void LS(View view){
        act="ls";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4LS);
        startActivity(intent);
    }
    public void PTN(View view) {
        act = "ptn";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4PTN);
        startActivity(intent);
    }
    public void PRN(View view) {
        act = "prn";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4PRN);
        startActivity(intent);
    }

    /**  syllabus for computer science----------------------------------------------------------------------- */
    public void OS(View view) {
        act = "os";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4OS);
        startActivity(intent);
    }

    public void COA(View view) {
        act = "coa";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4COA);
        startActivity(intent);
    }

    public void OOD(View view) {
        act = "ood";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4OOD);
        startActivity(intent);
    }

    public void PDD(View view) {
        act = "pdd";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4PDD);
        startActivity(intent);
    }

    public void FOSS(View view) {
        act = "foss";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4FOSS);
        startActivity(intent);
    }

    public void DSL(View view) {
        act = "dsl";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4DSL);
        startActivity(intent);
    }

    /**  syllabus for CIVIL ENGINEERING----------------------------------------------------------------------- */
    public void SA1(View view) {
        act = "sa1";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4STR);
        startActivity(intent);
    }

    public void CT(View view) {
        act = "ct";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4CONS);
        startActivity(intent);
    }

    public void FM2(View view) {
        act = "fm2";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4FM2);
        startActivity(intent);
    }

    public void GE1(View view) {
        act = "ge1";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4GEO1);
        startActivity(intent);
    }

    public void MTL1(View view) {
        act = "mtl1";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4MTLAB1);
        startActivity(intent);
    }

    public void FML(View view) {
        act = "fml";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4FML);
        startActivity(intent);
    }

/** S4 ELECTRONICS AND COMMUNICATION SYLLABUS**/

public void SAS(View view) {
    act = "sas";
    Intent intent = new Intent(Network.this, DetailActivity.class);
    intent.putExtra("name", R.string.S4ECSIG);
    startActivity(intent);
}

    public void AIC(View view) {
        act = "aic";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4ANALO);
        startActivity(intent);
    }

    public void CO(View view) {
        act = "co";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4ECCO);
        startActivity(intent);
    }

    public void ACE(View view) {
        act = "ace";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4ECANALOGCOM);
        startActivity(intent);
    }

    public void AICL(View view) {
        act = "aicl";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4ECINTEGRATEDLAB);
        startActivity(intent);
    }

    public void LCDL(View view) {
        act = "lcdl";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4ECLOGICLAB);
        startActivity(intent);
    }


    /** S4 MECHANICAL ENGINEERING SYLLABUS**/

    public void AMS(View view) {
        act = "ams";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4MEADVANCED);
        startActivity(intent);
    }

    public void TE(View view) {
        act = "te";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4METHERMAL);
        startActivity(intent);
    }

    public void FMACHINE(View view) {
        act = "fmachine";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4MEFLUIDMACHINE);
        startActivity(intent);
    }

    public void MT(View view) {
        act = "mt";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4MEMANUFACT);
        startActivity(intent);
    }

    public void TEL(View view) {
        act = "tel";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4METHERMALLAB);
        startActivity(intent);
    }

    public void FMML(View view) {
        act = "fmml";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4MEFLUIDLAB);
        startActivity(intent);
    }

    /** S4 ELECTRICAL AND ELECTRONICS ENGINEERING SYLLABUS**/

    public void SAIM (View view) {
        act = "saim";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4EESYNC);
        startActivity(intent);
    }

    public void DEALD(View view) {
        act = "deald";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4EEDIGITAL);
        startActivity(intent);
    }

    public void MS(View view) {
        act = "ms";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4EEMATERIAL);
        startActivity(intent);
    }

    public void MAI(View view) {
        act = "mai";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4EEMEASURE);
        startActivity(intent);
    }

    public void CAML(View view) {
        act = "caml";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4EECIRCUITSLAB);
        startActivity(intent);
    }

    public void EML1(View view) {
        act = "eml1";
        Intent intent = new Intent(Network.this, DetailActivity.class);
        intent.putExtra("name", R.string.S4EEMACHINESLAB);
        startActivity(intent);
    }
}