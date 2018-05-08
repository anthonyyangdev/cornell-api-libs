package com.developersam.api.cornell.data

/**
 * A simple [Bool] enum for Cornell APIs.
 */
enum class Bool {
    Y, N;

    /**
     * [toBoolean] converts the [Bool] value to a boolean.
     */
    fun toBoolean() = when (this) {
        Y -> true
        N -> false
    }
}

/**
 * [Campus] is a collection of supported campus values.
 *
 * @param description a simple description of the campus.
 */
enum class Campus(val description: String) {
    /**
     * Main campus
     */
    MAIN("Ithaca"),
    /**
     * New York City Cornell Tech.
     */
    NYT("New York Tech Campus")
}

/**
 * [CampusLocation] is a collection of supported campus location values.
 *
 * @param description a simple description of the campus location.
 */
enum class CampusLocation(val description: String) {
    /**
     * Main campus
     */
    ITH("Ithaca, NY (Main Campus)"),
    /**
     * New York City Cornell Tech.
     */
    NYCTECH("Cornell Tech")
}

/**
 * [AcademicCareerValue] is a collection of supported academic career value.
 *
 * @param description a simple description of the code.
 */
enum class AcademicCareerValue(val description: String) {
    UG("Undergraduate"), GR("Graduate"), GM("Graduate Management"),
    LA("Law"), VM("Veterinary Medicine")
}

/**
 * [AcademicGroupValue] is a collection of supported academic group value.
 *
 * @param description a simple description of the code.
 */
enum class AcademicGroupValue(val description: String) {
    AG("Agriculture and Life Sciences"), AR("Architecture, Art and Planning"),
    AS("Arts and Sciences"), AT("Athletics"), BU("Business"),
    CT("Cornell Tech"), EN("Engineering"), GR("Graduate"),
    HE("Human Ecology"), IL("Industrial and Labor Relations"),
    LA("Law"), OT("Reserve Officer Training"), VM("Veterinary Medicine")
}

/**
 * [SubjectValue] is a collection of supported subjects value.
 *
 * @param description a simple description of the code.
 */
enum class SubjectValue(val description: String) {
    AAS(description = "Asian American Studies"),
    AEM(description = "Applied Economics & Management"),
    AEP(description = "Applied & Engineering Physics"),
    AGSCI(description = "Agriculture Sciences"),
    AIIS(description = "American Indian & Indigenous"),
    AIRS(description = "Air Force Science"),
    ALS(description = "Agriculture & Life Sciences"),
    AMST(description = "American Studies"),
    ANSC(description = "Animal Science"),
    ANTHR(description = "Anthropology"),
    ARAB(description = "Arabic"),
    ARCH(description = "Architecture"),
    ARKEO(description = "Archaeology"),
    ART(description = "Art"),
    ARTH(description = "Art History"),
    AS(description = "Arts & Sciences"),
    ASIAN(description = "Asian Studies"),
    ASRC(description = "Africana Studies & Res Center"),
    ASTRO(description = "Astronomy"),
    BEE(description = "Biological & Environmental Eng"),
    BENGL(description = "Bengali"),
    BIOAP(description = "Animal Physiology & Anatomy"),
    BIOEE(description = "Ecology & Evolutionary Biology"),
    BIOG(description = "Biology: General Courses"),
    BIOMG(description = "Molecular Biology and Genetics"),
    BIOMI(description = "Microbiology"),
    BIOMS(description = "Bio Medical Science"),
    BIONB(description = "Neurobiology & Behavior"),
    BME(description = "Biomedical Engineering"),
    BPRE(description = "Baker Program in Real Estate"),
    BSOC(description = "Biology & Society"),
    BTRY(description = "Biometry & Statistics"),
    BURM(description = "Burmese"),
    CAPS(description = "China & Asia Pacific Studies"),
    CEE(description = "Civil & Environmental Engr"),
    CHEM(description = "Chemistry"),
    CHEME(description = "Chemical Engineering"),
    CHIN(description = "Chinese"),
    CHLIT(description = "Chinese Literature"),
    CLASS(description = "Classics"),
    COGST(description = "Cognitive Science"),
    COLLS(description = "College Scholar Program"),
    COML(description = "Comparative Literature"),
    COMM(description = "Communication"),
    CRP(description = "City & Regional Planning"),
    CS(description = "Computer Science"),
    CZECH(description = "Czech"),
    DEA(description = "Design & Environmental Analy"),
    DSOC(description = "Development Sociology"),
    DUTCH(description = "Dutch"),
    EAS(description = "Earth & Atmospheric Sciences"),
    ECE(description = "Electrical&ComputerEngineering"),
    ECON(description = "Economics"),
    EDUC(description = "Education"),
    ELSO(description = "English Language Support"),
    ENGL(description = "English"),
    ENGRC(description = "Engineering Communications"),
    ENGRD(description = "Engineering Distribution"),
    ENGRG(description = "Engineering General Interest"),
    ENGRI(description = "Engineering Introduction"),
    ENINT(description = "English for International Stdt"),
    ENTOM(description = "Entomology"),
    ESS(description = "Envr and Sust Sciences"),
    FDSC(description = "Food Science"),
    FGSS(description = "Feminist,Gender,Sexuality Stdy"),
    FREN(description = "French"),
    FSAD(description = "Fiber Science & Apparel Design"),
    GERST(description = "German Studies"),
    GOVT(description = "Government"),
    GRAD(description = "Graduate Research"),
    GREEK(description = "Greek"),
    HADM(description = "Hotel Administration"),
    HD(description = "Human Development"),
    HE(description = "Human Ecology Nondepartmental"),
    HEBRW(description = "Hebrew"),
    HINDI(description = "Hindi"),
    HIST(description = "History"),
    IARD(description = "Intl Agriculture & Rural Dev"),
    ILRHR(description = "ILR Human Resource Management"),
    ILRIC(description = "ILR International & Comp Labor"),
    ILRID(description = "ILR Interdepartmental"),
    ILRLE(description = "ILR Labor Economics"),
    ILRLR(description = "ILR Labor Relations, Law, Hist"),
    ILROB(description = "ILR Organizational Behavior"),
    ILRST(description = "ILR Social Statistics"),
    IM(description = "Independent Major"),
    INDO(description = "Indonesian"),
    INFO(description = "Information Science"),
    ITAL(description = "Italian"),
    JAPAN(description = "Japanese"),
    JPLIT(description = "Japanese Literature"),
    JWST(description = "Jewish Studies"),
    KANAD(description = "Kannada"),
    KHMER(description = "Khmer"),
    KOREA(description = "Korean"),
    LA(description = "Landscape Architecture"),
    LATA(description = "Latin American Studies"),
    LATIN(description = "Latin"),
    LAW(description = "Law"),
    LEAD(description = "Leadership"),
    LGBT(description = "Lesbian,Gay,Bisexual,Trns Stdy"),
    LING(description = "Linguistics"),
    LSP(description = "Latino Studies Program"),
    MAE(description = "Mechanical & Aerospace Eng"),
    MATH(description = "Mathematics"),
    MEDVL(description = "Medieval Studies"),
    MILS(description = "Military Science"),
    MSE(description = "Materials Science & Engr"),
    MUSIC(description = "Music"),
    NACCT(description = "Grad Mgmt Acct"),
    NAVS(description = "Naval Science"),
    NBA(description = "Grad Mgmt Business Admin"),
    NBAB(description = "Executive Boardroom Electives"),
    NBAE(description = "Business Admin Electives EMBA"),
    NBAY(description = "Grad Mgmt Business Admin NYT"),
    NCC(description = "Grad Mgmt Common Core"),
    NCCB(description = "Executive Boardroom Core"),
    NEPAL(description = "Nepali"),
    NES(description = "Near Eastern Studies"),
    NMI(description = "Grad Mgmt Individual Study"),
    NRE(description = "Graduate Management Research"),
    NS(description = "Nutritional Science"),
    NSE(description = "Nuclear Science & Engineering"),
    NTRES(description = "Natural Resources"),
    ORIE(description = "Op Research & Information Engr"),
    PADM(description = "Public Administration"),
    PALI(description = "Pali"),
    PAM(description = "Policy Analysis & Management"),
    PE(description = "Physical Education & Athletics"),
    PERSN(description = "Persian"),
    PHIL(description = "Philosophy"),
    PHYS(description = "Physics"),
    PLBIO(description = "Plant Biology"),
    PLBRG(description = "Plant Breeding"),
    PLHRT(description = "Horticulture Sciences"),
    PLPPM(description = "Plant Pathology"),
    PLSCI(description = "Plant Sciences"),
    PLSCS(description = "Soil & Crop Sciences"),
    PMA(description = "Performing and Media Arts"),
    POLSH(description = "Polish"),
    PORT(description = "Portuguese"),
    PSYCH(description = "Psychology"),
    PUNJB(description = "Punjabi"),
    RELST(description = "Religious Studies"),
    ROMAN(description = "Romanian"),
    ROMS(description = "Romance Studies"),
    RUSSA(description = "Russian"),
    RUSSL(description = "Russian Literature"),
    SANSK(description = "Sanskrit"),
    SHUM(description = "Society for Humanities"),
    SINHA(description = "Sinhalese"),
    SOC(description = "Sociology"),
    SPAN(description = "Spanish"),
    STS(description = "Science & Technology Studies"),
    STSCI(description = "Statistical Science"),
    SUMER(description = "Sumerian"),
    SWAHL(description = "Swahili"),
    SYSEN(description = "Systems Engineering"),
    TAG(description = "Tagalog"),
    TAMIL(description = "Tamil"),
    TECH(description = "Digital Technology & Practice"),
    THAI(description = "Thai"),
    TIBET(description = "Tibetan"),
    TOX(description = "Toxicology"),
    TURK(description = "Turkish"),
    URDU(description = "Urdu"),
    VETCS(description = "Vet Med Clinical Sciences"),
    VETMI(description = "Vet Med Microbiology"),
    VIEN(description = "Viticulture and Enology"),
    VIET(description = "Vietnamese"),
    VISST(description = "Visual Studies"),
    VTBMS(description = "Vet Med BioMedical Sciences"),
    VTMED(description = "Vet Med Professional Curriculm"),
    VTPMD(description = "Population Med&Diagnostic Svc"),
    WOLOF(description = "Wolof"),
    WRIT(description = "Writing Program"),
    YORUB(description = "Yoruba"),
    ZULU(description = "Zulu")
}

/**
 * [ClassComponent] is a collection of supported class components.
 */
enum class ClassComponent {
    /**
     * Lecture
     */
    LEC,
    /**
     * Discussion
     */
    DIS,
    /**
     * Lab
     */
    LAB,
    /**
     * TA
     */
    TA
}

/**
 * [GradingBasis] is a collection of supported grading basis.
 */
enum class GradingBasis {
    /**
     * Letter Grade
     */
    GRD,
    /**
     * Student Choice
     */
    OPT,
    /**
     * S/U only
     */
    SUS
}

/**
 * [InstructionMode] is a collection of supported instruction modes.
 *
 * @param description a simple description of the code.
 */
enum class InstructionMode(val description: String) {
    P("In Person"), DW("Distance Learning - WWW")
}
