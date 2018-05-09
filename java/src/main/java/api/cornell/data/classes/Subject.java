package api.cornell.data.classes;

import org.jetbrains.annotations.NotNull;

/**
 * {@code Subject} is a collection of supported subjects value.
 */
public enum Subject {
    
    /**
     * Asian American Studies.
     */
    AAS("Asian American Studies"),
    /**
     * American Indian Studies.
     */
    AIS("American Indian Studies"),
    /**
     * Applied Economics & Management.
     */
    AEM("Applied Economics & Management"),
    /**
     * Applied & Engineering Physics.
     */
    AEP("Applied & Engineering Physics"),
    /**
     * Agriculture Sciences.
     */
    AGSCI("Agriculture Sciences"),
    /**
     * American Indian & Indigenous.
     */
    AIIS("American Indian & Indigenous"),
    /**
     * Air Force Science.
     */
    AIRS("Air Force Science"),
    /**
     * Akkadian.
     */
    AKKAD("Akkadian"),
    /**
     * Agriculture & Life Sciences.
     */
    ALS("Agriculture & Life Sciences"),
    /**
     * American Studies.
     */
    AMST("American Studies"),
    /**
     * Animal Science.
     */
    ANSC("Animal Science"),
    /**
     * Anthropology.
     */
    ANTHR("Anthropology"),
    /**
     * Arabic.
     */
    ARAB("Arabic"),
    /**
     * Architecture.
     */
    ARCH("Architecture"),
    /**
     * Archaeology.
     */
    ARKEO("Archaeology"),
    /**
     * Art.
     */
    ART("Art"),
    /**
     * Art History.
     */
    ARTH("Art History"),
    /**
     * Arts & Sciences.
     */
    AS("Arts & Sciences"),
    /**
     * Asian Studies.
     */
    ASIAN("Asian Studies"),
    /**
     * Africana Studies & Res Center.
     */
    ASRC("Africana Studies & Res Center"),
    /**
     * Astronomy.
     */
    ASTRO("Astronomy"),
    /**
     * Bosnian, Croatian, Serbian.
     */
    BCS("Bosnian, Croatian, Serbian"),
    /**
     * Biological & Environmental Eng.
     */
    BEE("Biological & Environmental Eng"),
    /**
     * Bengali.
     */
    BENGL("Bengali"),
    /**
     * Animal Physiology & Anatomy.
     */
    BIOAP("Animal Physiology & Anatomy"),
    /**
     * Ecology & Evolutionary Biology.
     */
    BIOEE("Ecology & Evolutionary Biology"),
    /**
     * Biology: General Courses.
     */
    BIOG("Biology: General Courses"),
    /**
     * Molecular Biology and Genetics.
     */
    BIOMG("Molecular Biology and Genetics"),
    /**
     * Microbiology.
     */
    BIOMI("Microbiology"),
    /**
     * Bio Medical Science.
     */
    BIOMS("Bio Medical Science"),
    /**
     * Plant Biology.
     */
    BIOPL("Plant Biology"),
    /**
     * Neurobiology & Behavior.
     */
    BIONB("Neurobiology & Behavior"),
    /**
     * Biomedical Engineering.
     */
    BME("Biomedical Engineering"),
    /**
     * Baker Program in Real Estate.
     */
    BPRE("Baker Program in Real Estate"),
    /**
     * Biology & Society.
     */
    BSOC("Biology & Society"),
    /**
     * Biometry & Statistics.
     */
    BTRY("Biometry & Statistics"),
    /**
     * Burmese.
     */
    BURM("Burmese"),
    /**
     * China & Asia Pacific Studies.
     */
    CAPS("China & Asia Pacific Studies"),
    /**
     * Civil & Environmental Engr.
     */
    CEE("Civil & Environmental Engr"),
    /**
     * Chemistry.
     */
    CHEM("Chemistry"),
    /**
     * Chemical Engineering.
     */
    CHEME("Chemical Engineering"),
    /**
     * Chinese.
     */
    CHIN("Chinese"),
    /**
     * Chinese Literature.
     */
    CHLIT("Chinese Literature"),
    /**
     * Classics.
     */
    CLASS("Classics"),
    /**
     * Cognitive Science.
     */
    COGST("Cognitive Science"),
    /**
     * College Scholar Program.
     */
    COLLS("College Scholar Program"),
    /**
     * Comparative Literature.
     */
    COML("Comparative Literature"),
    /**
     * Communication.
     */
    COMM("Communication"),
    /**
     * City & Regional Planning.
     */
    CRP("City & Regional Planning"),
    /**
     * Computer Science.
     */
    CS("Computer Science"),
    /**
     * Crop & Soil Sciences.
     */
    CSS("Crop & Soil Sciences"),
    /**
     * Czech.
     */
    CZECH("Czech"),
    /**
     * Design & Environmental Analy.
     */
    DEA("Design & Environmental Analy"),
    /**
     * Development Sociology.
     */
    DSOC("Development Sociology"),
    /**
     * Dutch.
     */
    DUTCH("Dutch"),
    /**
     * Earth & Atmospheric Sciences.
     */
    EAS("Earth & Atmospheric Sciences"),
    /**
     * Electrical & Computer Engineering.
     */
    ECE("Electrical & Computer Engineering"),
    /**
     * Economics.
     */
    ECON("Economics"),
    /**
     * Education.
     */
    EDUC("Education"),
    /**
     * English Language Support.
     */
    ELSO("English Language Support"),
    /**
     * English.
     */
    ENGL("English"),
    /**
     * Engineering Communications.
     */
    ENGRC("Engineering Communications"),
    /**
     * Engineering Distribution.
     */
    ENGRD("Engineering Distribution"),
    /**
     * Engineering General Interest.
     */
    ENGRG("Engineering General Interest"),
    /**
     * Engineering Introduction.
     */
    ENGRI("Engineering Introduction"),
    /**
     * English for International Stdt.
     */
    ENINT("English for International Stdt"),
    /**
     * Engineering Management.
     */
    ENMGT("Engineering Management"),
    /**
     * Entomology.
     */
    ENTOM("Entomology"),
    /**
     * Envr and Sust Sciences.
     */
    ESS("Envr and Sust Sciences"),
    /**
     * Food Science.
     */
    FDSC("Food Science"),
    /**
     * Feminist,Gender,Sexuality Stdy.
     */
    FGSS("Feminist,Gender,Sexuality Stdy"),
    /**
     * French.
     */
    FREN("French"),
    /**
     * Fiber Science & Apparel Design.
     */
    FSAD("Fiber Science & Apparel Design"),
    /**
     * German Studies.
     */
    GERST("German Studies"),
    /**
     * Government.
     */
    GOVT("Government"),
    /**
     * Graduate Research.
     */
    GRAD("Graduate Research"),
    /**
     * Greek.
     */
    GREEK("Greek"),
    /**
     * Hotel Administration.
     */
    HADM("Hotel Administration"),
    /**
     * Human Development.
     */
    HD("Human Development"),
    /**
     * Human Ecology Nondepartmental.
     */
    HE("Human Ecology Nondepartmental"),
    /**
     * Hebrew.
     */
    HEBRW("Hebrew"),
    /**
     * Hindi.
     */
    HINDI("Hindi"),
    /**
     * History.
     */
    HIST("History"),
    /**
     * Horticulture Sciences.
     */
    HORT("Horticulture Sciences"),
    /**
     * Hungarian.
     */
    HUNGR("Hungarian"),
    /**
     * Intl Agriculture & Rural Dev.
     */
    IARD("Intl Agriculture & Rural Dev"),
    /**
     * ILR Human Resource Management.
     */
    ILRHR("ILR Human Resource Management"),
    /**
     * ILR International & Comp Labor.
     */
    ILRIC("ILR International & Comp Labor"),
    /**
     * ILR Interdepartmental.
     */
    ILRID("ILR Interdepartmental"),
    /**
     * ILR Labor Economics.
     */
    ILRLE("ILR Labor Economics"),
    /**
     * ILR Labor Relations, Law, Hist.
     */
    ILRLR("ILR Labor Relations, Law, Hist"),
    /**
     * ILR Organizational Behavior.
     */
    ILROB("ILR Organizational Behavior"),
    /**
     * ILR Social Statistics.
     */
    ILRST("ILR Social Statistics"),
    /**
     * Independent Major.
     */
    IM("Independent Major"),
    /**
     * Indonesian.
     */
    INDO("Indonesian"),
    /**
     * Information Science.
     */
    INFO("Information Science"),
    /**
     * Italian.
     */
    ITAL("Italian"),
    /**
     * Japanese.
     */
    JAPAN("Japanese"),
    /**
     * Japanese Literature.
     */
    JPLIT("Japanese Literature"),
    /**
     * Jewish Studies.
     */
    JWST("Jewish Studies"),
    /**
     * Kannada.
     */
    KANAD("Kannada"),
    /**
     * Khmer.
     */
    KHMER("Khmer"),
    /**
     * Korean.
     */
    KOREA("Korean"),
    /**
     * Korean Literature.
     */
    KRLIT("Korean Literature"),
    /**
     * Landscape Architecture.
     */
    LA("Landscape Architecture"),
    /**
     * Latin American Studies.
     */
    LATA("Latin American Studies"),
    /**
     * Latin.
     */
    LATIN("Latin"),
    /**
     * Law.
     */
    LAW("Law"),
    /**
     * Leadership.
     */
    LEAD("Leadership"),
    /**
     * Lesbian, Gay, Bisexual, Trns Stdy.
     */
    LGBT("Lesbian, Gay, Bisexual, Trns Stdy"),
    /**
     * Linguistics.
     */
    LING("Linguistics"),
    /**
     * Latino Studies Program.
     */
    LSP("Latino Studies Program"),
    /**
     * Mechanical & Aerospace Eng.
     */
    MAE("Mechanical & Aerospace Eng"),
    /**
     * Mathematics.
     */
    MATH("Mathematics"),
    /**
     * Medieval Studies.
     */
    MEDVL("Medieval Studies"),
    /**
     * Military Science.
     */
    MILS("Military Science"),
    /**
     * Modern Greek.
     */
    MOGRK("Modern Greek"),
    /**
     * Materials Science & Engr.
     */
    MSE("Materials Science & Engr"),
    /**
     * Music.
     */
    MUSIC("Music"),
    /**
     * Grad Mgmt Acct.
     */
    NACCT("Grad Mgmt Acct"),
    /**
     * Naval Science.
     */
    NAVS("Naval Science"),
    /**
     * Grad Mgmt Business Admin.
     */
    NBA("Grad Mgmt Business Admin"),
    /**
     * Grad Mgmt Business Admin CT
     */
    NBAT("Grad Mgmt Business Admin CT"),
    /**
     * Executive Boardroom Electives.
     */
    NBAB("Executive Boardroom Electives"),
    /**
     * Business Admin Electives EMBA.
     */
    NBAE("Business Admin Electives EMBA"),
    /**
     * Grad Mgmt Business Admin NYT.
     */
    NBAY("Grad Mgmt Business Admin NYT"),
    /**
     * Grad Mgmt Common Core.
     */
    NCC("Grad Mgmt Common Core"),
    /**
     * Executive Boardroom Core.
     */
    NCCB("Executive Boardroom Core"),
    /**
     * Grad Mgmt Common Core NYT.
     */
    NCCY("Grad Mgmt Common Core NYT"),
    /**
     * Nepali.
     */
    NEPAL("Nepali"),
    /**
     * Near Eastern Studies.
     */
    NES("Near Eastern Studies"),
    /**
     * Grad Mgmt Individual Study.
     */
    NMI("Grad Mgmt Individual Study"),
    /**
     * Graduate Management Research.
     */
    NRE("Graduate Management Research"),
    /**
     * Nutritional Science.
     */
    NS("Nutritional Science"),
    /**
     * Nuclear Science & Engineering.
     */
    NSE("Nuclear Science & Engineering"),
    /**
     * Natural Resources.
     */
    NTRES("Natural Resources"),
    /**
     * Op Research & Information Engr.
     */
    ORIE("Op Research & Information Engr"),
    /**
     * Public Administration.
     */
    PADM("Public Administration"),
    /**
     * Pali.
     */
    PALI("Pali"),
    /**
     * Policy Analysis & Management.
     */
    PAM("Policy Analysis & Management"),
    /**
     * Physical Education & Athletics.
     */
    PE("Physical Education & Athletics"),
    /**
     * Persian.
     */
    PERSN("Persian"),
    /**
     * Philosophy.
     */
    PHIL("Philosophy"),
    /**
     * Physics.
     */
    PHYS("Physics"),
    /**
     * Plant Biology.
     */
    PLBIO("Plant Biology"),
    /**
     * Plant Breeding.
     */
    PLBR("Plant Breeding"),
    /**
     * Plant Breeding.
     */
    PLBRG("Plant Breeding"),
    /**
     * Horticulture Sciences.
     */
    PLHRT("Horticulture Sciences"),
    /**
     * Plant Pathology.
     */
    PLPPM("Plant Pathology"),
    /**
     * Plant Pathology.
     */
    PLPA("Plant Pathology"),
    /**
     * Plant Sciences.
     */
    PLSCI("Plant Sciences"),
    /**
     * Soil & Crop Sciences.
     */
    PLSCS("Soil & Crop Sciences"),
    /**
     * Performing and Media Arts.
     */
    PMA("Performing and Media Arts"),
    /**
     * Polish.
     */
    POLSH("Polish"),
    /**
     * Portuguese.
     */
    PORT("Portuguese"),
    /**
     * Psychology.
     */
    PSYCH("Psychology"),
    /**
     * Punjabi.
     */
    PUNJB("Punjabi"),
    /**
     * Religious Studies.
     */
    RELST("Religious Studies"),
    /**
     * Romanian.
     */
    ROMAN("Romanian"),
    /**
     * Romance Studies.
     */
    ROMS("Romance Studies"),
    /**
     * Russian.
     */
    RUSSA("Russian"),
    /**
     * Russian Literature.
     */
    RUSSL("Russian Literature"),
    /**
     * Sanskrit.
     */
    SANSK("Sanskrit"),
    /**
     * Sea Education Association
     */
    SEA("Sea Education Association"),
    /**
     * Society for Humanities.
     */
    SHUM("Society for Humanities"),
    /**
     * Sinhalese.
     */
    SINHA("Sinhalese"),
    /**
     * Science of Natural & Envir Sys.
     */
    SNES("Science of Natural & Envir Sys"),
    /**
     * Sanskrit Literature.
     */
    SNLIT("Sanskrit Literature"),
    /**
     * Sociology.
     */
    SOC("Sociology"),
    /**
     * Spanish.
     */
    SPAN("Spanish"),
    /**
     * Science & Technology Studies.
     */
    STS("Science & Technology Studies"),
    /**
     * Statistical Science.
     */
    STSCI("Statistical Science"),
    /**
     * Sumerian.
     */
    SUMER("Sumerian"),
    /**
     * Swahili.
     */
    SWAHL("Swahili"),
    /**
     * Systems Engineering.
     */
    SYSEN("Systems Engineering"),
    /**
     * Tagalog.
     */
    TAG("Tagalog"),
    /**
     * Tamil.
     */
    TAMIL("Tamil"),
    /**
     * Digital Technology & Practice.
     */
    TECH("Digital Technology & Practice"),
    /**
     * Thai.
     */
    THAI("Thai"),
    /**
     * Tibetan.
     */
    TIBET("Tibetan"),
    /**
     * Toxicology.
     */
    TOX("Toxicology"),
    /**
     * Ukrainian.
     */
    UKRAN("Ukrainian"),
    /**
     * Turkish.
     */
    TURK("Turkish"),
    /**
     * Urdu.
     */
    URDU("Urdu"),
    /**
     * Vet Med Clinical Sciences.
     */
    VETCS("Vet Med Clinical Sciences"),
    /**
     * Vet Med Microbiology.
     */
    VETMI("Vet Med Microbiology"),
    /**
     * Vet Medicine Molecular Medicine.
     */
    VETMM("Vet Medicine Molecular Medicine"),
    /**
     * Viticulture and Enology.
     */
    VIEN("Viticulture and Enology"),
    /**
     * Vietnamese.
     */
    VIET("Vietnamese"),
    /**
     * Visual Studies.
     */
    VISST("Visual Studies"),
    /**
     * Vet Med BioMedical Sciences.
     */
    VTBMS("Vet Med BioMedical Sciences"),
    /**
     * Vet Med Professional Curriculm.
     */
    VTMED("Vet Med Professional Curriculm"),
    /**
     * Population Med&Diagnostic Svc.
     */
    VTPMD("Population Med&Diagnostic Svc"),
    /**
     * Wolof.
     */
    WOLOF("Wolof"),
    /**
     * Writing Program.
     */
    WRIT("Writing Program"),
    /**
     * Yoruba.
     */
    YORUB("Yoruba"),
    /**
     * Zulu.
     */
    ZULU("Zulu");
    
    /**
     * A simple description of the code.
     */
    @NotNull
    private final String description;
    
    /**
     * Construct an {@code Subject}.
     *
     * @param description a simple description of the code.
     */
    Subject(@NotNull String description) {
        this.description = description;
    }
    
    /**
     * Obtain a simple description of the code.
     *
     * @return a simple description of the code.
     */
    @NotNull
    public String getDescription() {
        return description;
    }
}
