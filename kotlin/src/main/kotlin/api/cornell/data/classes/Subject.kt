package api.cornell.data.classes

/**
 * [Subject] is a collection of supported subjects value.
 *
 * @param description a simple description of the code.
 */
enum class Subject(val description: String) {
    /**
     * Asian American Studies.
     */
    AAS(description = "Asian American Studies"),
    /**
     * American Indian Studies.
     */
    AIS(description = "American Indian Studies"),
    /**
     * Applied Economics & Management.
     */
    AEM(description = "Applied Economics & Management"),
    /**
     * Applied & Engineering Physics.
     */
    AEP(description = "Applied & Engineering Physics"),
    /**
     * Agriculture Sciences.
     */
    AGSCI(description = "Agriculture Sciences"),
    /**
     * American Indian & Indigenous.
     */
    AIIS(description = "American Indian & Indigenous"),
    /**
     * Air Force Science.
     */
    AIRS(description = "Air Force Science"),
    /**
     * Akkadian.
     */
    AKKAD(description = "Akkadian"),
    /**
     * Agriculture & Life Sciences.
     */
    ALS(description = "Agriculture & Life Sciences"),
    /**
     * American Studies.
     */
    AMST(description = "American Studies"),
    /**
     * Animal Science.
     */
    ANSC(description = "Animal Science"),
    /**
     * Anthropology.
     */
    ANTHR(description = "Anthropology"),
    /**
     * Arabic.
     */
    ARAB(description = "Arabic"),
    /**
     * Architecture.
     */
    ARCH(description = "Architecture"),
    /**
     * Archaeology.
     */
    ARKEO(description = "Archaeology"),
    /**
     * Art.
     */
    ART(description = "Art"),
    /**
     * Art History.
     */
    ARTH(description = "Art History"),
    /**
     * Arts & Sciences.
     */
    AS(description = "Arts & Sciences"),
    /**
     * Asian Studies.
     */
    ASIAN(description = "Asian Studies"),
    /**
     * Africana Studies & Res Center.
     */
    ASRC(description = "Africana Studies & Res Center"),
    /**
     * Astronomy.
     */
    ASTRO(description = "Astronomy"),
    /**
     * Bosnian, Croatian, Serbian.
     */
    BCS(description = "Bosnian, Croatian, Serbian"),
    /**
     * Biological & Environmental Eng.
     */
    BEE(description = "Biological & Environmental Eng"),
    /**
     * Bengali.
     */
    BENGL(description = "Bengali"),
    /**
     * Animal Physiology & Anatomy.
     */
    BIOAP(description = "Animal Physiology & Anatomy"),
    /**
     * Ecology & Evolutionary Biology.
     */
    BIOEE(description = "Ecology & Evolutionary Biology"),
    /**
     * Biology: General Courses.
     */
    BIOG(description = "Biology: General Courses"),
    /**
     * Molecular Biology and Genetics.
     */
    BIOMG(description = "Molecular Biology and Genetics"),
    /**
     * Microbiology.
     */
    BIOMI(description = "Microbiology"),
    /**
     * Bio Medical Science.
     */
    BIOMS(description = "Bio Medical Science"),
    /**
     * Plant Biology.
     */
    BIOPL(description = "Plant Biology"),
    /**
     * Neurobiology & Behavior.
     */
    BIONB(description = "Neurobiology & Behavior"),
    /**
     * Biomedical Engineering.
     */
    BME(description = "Biomedical Engineering"),
    /**
     * Baker Program in Real Estate.
     */
    BPRE(description = "Baker Program in Real Estate"),
    /**
     * Biology & Society.
     */
    BSOC(description = "Biology & Society"),
    /**
     * Biometry & Statistics.
     */
    BTRY(description = "Biometry & Statistics"),
    /**
     * Burmese.
     */
    BURM(description = "Burmese"),
    /**
     * China & Asia Pacific Studies.
     */
    CAPS(description = "China & Asia Pacific Studies"),
    /**
     * Civil & Environmental Engr.
     */
    CEE(description = "Civil & Environmental Engr"),
    /**
     * Chemistry.
     */
    CHEM(description = "Chemistry"),
    /**
     * Chemical Engineering.
     */
    CHEME(description = "Chemical Engineering"),
    /**
     * Chinese.
     */
    CHIN(description = "Chinese"),
    /**
     * Chinese Literature.
     */
    CHLIT(description = "Chinese Literature"),
    /**
     * Classics.
     */
    CLASS(description = "Classics"),
    /**
     * Cognitive Science.
     */
    COGST(description = "Cognitive Science"),
    /**
     * College Scholar Program.
     */
    COLLS(description = "College Scholar Program"),
    /**
     * Comparative Literature.
     */
    COML(description = "Comparative Literature"),
    /**
     * Communication.
     */
    COMM(description = "Communication"),
    /**
     * City & Regional Planning.
     */
    CRP(description = "City & Regional Planning"),
    /**
     * Computer Science.
     */
    CS(description = "Computer Science"),
    /**
     * Crop & Soil Sciences.
     */
    CSS(description = "Crop & Soil Sciences"),
    /**
     * Czech.
     */
    CZECH(description = "Czech"),
    /**
     * Design & Environmental Analy.
     */
    DEA(description = "Design & Environmental Analy"),
    /**
     * Development Sociology.
     */
    DSOC(description = "Development Sociology"),
    /**
     * Dutch.
     */
    DUTCH(description = "Dutch"),
    /**
     * Earth & Atmospheric Sciences.
     */
    EAS(description = "Earth & Atmospheric Sciences"),
    /**
     * Electrical & Computer Engineering.
     */
    ECE(description = "Electrical & Computer Engineering"),
    /**
     * Economics.
     */
    ECON(description = "Economics"),
    /**
     * Education.
     */
    EDUC(description = "Education"),
    /**
     * English Language Support.
     */
    ELSO(description = "English Language Support"),
    /**
     * English.
     */
    ENGL(description = "English"),
    /**
     * Engineering Communications.
     */
    ENGRC(description = "Engineering Communications"),
    /**
     * Engineering Distribution.
     */
    ENGRD(description = "Engineering Distribution"),
    /**
     * Engineering General Interest.
     */
    ENGRG(description = "Engineering General Interest"),
    /**
     * Engineering Introduction.
     */
    ENGRI(description = "Engineering Introduction"),
    /**
     * English for International Stdt.
     */
    ENINT(description = "English for International Stdt"),
    /**
     * Engineering Management.
     */
    ENMGT(description = "Engineering Management"),
    /**
     * Entomology.
     */
    ENTOM(description = "Entomology"),
    /**
     * Envr and Sust Sciences.
     */
    ESS(description = "Envr and Sust Sciences"),
    /**
     * Food Science.
     */
    FDSC(description = "Food Science"),
    /**
     * Feminist,Gender,Sexuality Stdy.
     */
    FGSS(description = "Feminist,Gender,Sexuality Stdy"),
    /**
     * French.
     */
    FREN(description = "French"),
    /**
     * Fiber Science & Apparel Design.
     */
    FSAD(description = "Fiber Science & Apparel Design"),
    /**
     * German Studies.
     */
    GERST(description = "German Studies"),
    /**
     * Government.
     */
    GOVT(description = "Government"),
    /**
     * Graduate Research.
     */
    GRAD(description = "Graduate Research"),
    /**
     * Greek.
     */
    GREEK(description = "Greek"),
    /**
     * Hotel Administration.
     */
    HADM(description = "Hotel Administration"),
    /**
     * Human Development.
     */
    HD(description = "Human Development"),
    /**
     * Human Ecology Nondepartmental.
     */
    HE(description = "Human Ecology Nondepartmental"),
    /**
     * Hebrew.
     */
    HEBRW(description = "Hebrew"),
    /**
     * Hindi.
     */
    HINDI(description = "Hindi"),
    /**
     * History.
     */
    HIST(description = "History"),
    /**
     * Horticulture Sciences.
     */
    HORT(description = "Horticulture Sciences"),
    /**
     * Hungarian.
     */
    HUNGR(description = "Hungarian"),
    /**
     * Intl Agriculture & Rural Dev.
     */
    IARD(description = "Intl Agriculture & Rural Dev"),
    /**
     * ILR Human Resource Management.
     */
    ILRHR(description = "ILR Human Resource Management"),
    /**
     * ILR International & Comp Labor.
     */
    ILRIC(description = "ILR International & Comp Labor"),
    /**
     * ILR Interdepartmental.
     */
    ILRID(description = "ILR Interdepartmental"),
    /**
     * ILR Labor Economics.
     */
    ILRLE(description = "ILR Labor Economics"),
    /**
     * ILR Labor Relations, Law, Hist.
     */
    ILRLR(description = "ILR Labor Relations, Law, Hist"),
    /**
     * ILR Organizational Behavior.
     */
    ILROB(description = "ILR Organizational Behavior"),
    /**
     * ILR Social Statistics.
     */
    ILRST(description = "ILR Social Statistics"),
    /**
     * Independent Major.
     */
    IM(description = "Independent Major"),
    /**
     * Indonesian.
     */
    INDO(description = "Indonesian"),
    /**
     * Information Science.
     */
    INFO(description = "Information Science"),
    /**
     * Italian.
     */
    ITAL(description = "Italian"),
    /**
     * Japanese.
     */
    JAPAN(description = "Japanese"),
    /**
     * Japanese Literature.
     */
    JPLIT(description = "Japanese Literature"),
    /**
     * Jewish Studies.
     */
    JWST(description = "Jewish Studies"),
    /**
     * Kannada.
     */
    KANAD(description = "Kannada"),
    /**
     * Khmer.
     */
    KHMER(description = "Khmer"),
    /**
     * Korean.
     */
    KOREA(description = "Korean"),
    /**
     * Korean Literature.
     */
    KRLIT(description = "Korean Literature"),
    /**
     * Landscape Architecture.
     */
    LA(description = "Landscape Architecture"),
    /**
     * Latin American Studies.
     */
    LATA(description = "Latin American Studies"),
    /**
     * Latin.
     */
    LATIN(description = "Latin"),
    /**
     * Law.
     */
    LAW(description = "Law"),
    /**
     * Leadership.
     */
    LEAD(description = "Leadership"),
    /**
     * Lesbian, Gay, Bisexual, Trns Stdy.
     */
    LGBT(description = "Lesbian, Gay, Bisexual, Trns Stdy"),
    /**
     * Linguistics.
     */
    LING(description = "Linguistics"),
    /**
     * Latino Studies Program.
     */
    LSP(description = "Latino Studies Program"),
    /**
     * Mechanical & Aerospace Eng.
     */
    MAE(description = "Mechanical & Aerospace Eng"),
    /**
     * Mathematics.
     */
    MATH(description = "Mathematics"),
    /**
     * Medieval Studies.
     */
    MEDVL(description = "Medieval Studies"),
    /**
     * Military Science.
     */
    MILS(description = "Military Science"),
    /**
     * Modern Greek.
     */
    MOGRK(description = "Modern Greek"),
    /**
     * Materials Science & Engr.
     */
    MSE(description = "Materials Science & Engr"),
    /**
     * Music.
     */
    MUSIC(description = "Music"),
    /**
     * Grad Mgmt Acct.
     */
    NACCT(description = "Grad Mgmt Acct"),
    /**
     * Naval Science.
     */
    NAVS(description = "Naval Science"),
    /**
     * Grad Mgmt Business Admin.
     */
    NBA(description = "Grad Mgmt Business Admin"),
    /**
     * Grad Mgmt Business Admin CT
     */
    NBAT(description = "Grad Mgmt Business Admin CT"),
    /**
     * Executive Boardroom Electives.
     */
    NBAB(description = "Executive Boardroom Electives"),
    /**
     * Business Admin Electives EMBA.
     */
    NBAE(description = "Business Admin Electives EMBA"),
    /**
     * Grad Mgmt Business Admin NYT.
     */
    NBAY(description = "Grad Mgmt Business Admin NYT"),
    /**
     * Grad Mgmt Common Core.
     */
    NCC(description = "Grad Mgmt Common Core"),
    /**
     * Executive Boardroom Core.
     */
    NCCB(description = "Executive Boardroom Core"),
    /**
     * Grad Mgmt Common Core NYT.
     */
    NCCY(description = "Grad Mgmt Common Core NYT"),
    /**
     * Nepali.
     */
    NEPAL(description = "Nepali"),
    /**
     * Near Eastern Studies.
     */
    NES(description = "Near Eastern Studies"),
    /**
     * Grad Mgmt Individual Study.
     */
    NMI(description = "Grad Mgmt Individual Study"),
    /**
     * Graduate Management Research.
     */
    NRE(description = "Graduate Management Research"),
    /**
     * Nutritional Science.
     */
    NS(description = "Nutritional Science"),
    /**
     * Nuclear Science & Engineering.
     */
    NSE(description = "Nuclear Science & Engineering"),
    /**
     * Natural Resources.
     */
    NTRES(description = "Natural Resources"),
    /**
     * Op Research & Information Engr.
     */
    ORIE(description = "Op Research & Information Engr"),
    /**
     * Public Administration.
     */
    PADM(description = "Public Administration"),
    /**
     * Pali.
     */
    PALI(description = "Pali"),
    /**
     * Policy Analysis & Management.
     */
    PAM(description = "Policy Analysis & Management"),
    /**
     * Physical Education & Athletics.
     */
    PE(description = "Physical Education & Athletics"),
    /**
     * Persian.
     */
    PERSN(description = "Persian"),
    /**
     * Philosophy.
     */
    PHIL(description = "Philosophy"),
    /**
     * Physics.
     */
    PHYS(description = "Physics"),
    /**
     * Plant Biology.
     */
    PLBIO(description = "Plant Biology"),
    /**
     * Plant Breeding.
     */
    PLBR(description = "Plant Breeding"),
    /**
     * Plant Breeding.
     */
    PLBRG(description = "Plant Breeding"),
    /**
     * Horticulture Sciences.
     */
    PLHRT(description = "Horticulture Sciences"),
    /**
     * Plant Pathology.
     */
    PLPPM(description = "Plant Pathology"),
    /**
     * Plant Pathology.
     */
    PLPA(description = "Plant Pathology"),
    /**
     * Plant Sciences.
     */
    PLSCI(description = "Plant Sciences"),
    /**
     * Soil & Crop Sciences.
     */
    PLSCS(description = "Soil & Crop Sciences"),
    /**
     * Performing and Media Arts.
     */
    PMA(description = "Performing and Media Arts"),
    /**
     * Polish.
     */
    POLSH(description = "Polish"),
    /**
     * Portuguese.
     */
    PORT(description = "Portuguese"),
    /**
     * Psychology.
     */
    PSYCH(description = "Psychology"),
    /**
     * Punjabi.
     */
    PUNJB(description = "Punjabi"),
    /**
     * Religious Studies.
     */
    RELST(description = "Religious Studies"),
    /**
     * Romanian.
     */
    ROMAN(description = "Romanian"),
    /**
     * Romance Studies.
     */
    ROMS(description = "Romance Studies"),
    /**
     * Russian.
     */
    RUSSA(description = "Russian"),
    /**
     * Russian Literature.
     */
    RUSSL(description = "Russian Literature"),
    /**
     * Sanskrit.
     */
    SANSK(description = "Sanskrit"),
    /**
     * Sea Education Association
     */
    SEA(description = "Sea Education Association"),
    /**
     * Society for Humanities.
     */
    SHUM(description = "Society for Humanities"),
    /**
     * Sinhalese.
     */
    SINHA(description = "Sinhalese"),
    /**
     * Science of Natural & Envir Sys.
     */
    SNES(description = "Science of Natural & Envir Sys"),
    /**
     * Sanskrit Literature.
     */
    SNLIT(description = "Sanskrit Literature"),
    /**
     * Sociology.
     */
    SOC(description = "Sociology"),
    /**
     * Spanish.
     */
    SPAN(description = "Spanish"),
    /**
     * Science & Technology Studies.
     */
    STS(description = "Science & Technology Studies"),
    /**
     * Statistical Science.
     */
    STSCI(description = "Statistical Science"),
    /**
     * Sumerian.
     */
    SUMER(description = "Sumerian"),
    /**
     * Swahili.
     */
    SWAHL(description = "Swahili"),
    /**
     * Systems Engineering.
     */
    SYSEN(description = "Systems Engineering"),
    /**
     * Tagalog.
     */
    TAG(description = "Tagalog"),
    /**
     * Tamil.
     */
    TAMIL(description = "Tamil"),
    /**
     * Digital Technology & Practice.
     */
    TECH(description = "Digital Technology & Practice"),
    /**
     * Thai.
     */
    THAI(description = "Thai"),
    /**
     * Tibetan.
     */
    TIBET(description = "Tibetan"),
    /**
     * Toxicology.
     */
    TOX(description = "Toxicology"),
    /**
     * Ukrainian.
     */
    UKRAN(description = "Ukrainian"),
    /**
     * Turkish.
     */
    TURK(description = "Turkish"),
    /**
     * Urdu.
     */
    URDU(description = "Urdu"),
    /**
     * Vet Med Clinical Sciences.
     */
    VETCS(description = "Vet Med Clinical Sciences"),
    /**
     * Vet Med Microbiology.
     */
    VETMI(description = "Vet Med Microbiology"),
    /**
     * Vet Medicine Molecular Medicine.
     */
    VETMM(description = "Vet Medicine Molecular Medicine"),
    /**
     * Viticulture and Enology.
     */
    VIEN(description = "Viticulture and Enology"),
    /**
     * Vietnamese.
     */
    VIET(description = "Vietnamese"),
    /**
     * Visual Studies.
     */
    VISST(description = "Visual Studies"),
    /**
     * Vet Med BioMedical Sciences.
     */
    VTBMS(description = "Vet Med BioMedical Sciences"),
    /**
     * Vet Med Professional Curriculm.
     */
    VTMED(description = "Vet Med Professional Curriculm"),
    /**
     * Population Med&Diagnostic Svc.
     */
    VTPMD(description = "Population Med&Diagnostic Svc"),
    /**
     * Wolof.
     */
    WOLOF(description = "Wolof"),
    /**
     * Writing Program.
     */
    WRIT(description = "Writing Program"),
    /**
     * Yoruba.
     */
    YORUB(description = "Yoruba"),
    /**
     * Zulu.
     */
    ZULU(description = "Zulu")
}
