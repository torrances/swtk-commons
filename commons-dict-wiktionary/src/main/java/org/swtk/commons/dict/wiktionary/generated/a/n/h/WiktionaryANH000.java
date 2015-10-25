package org.swtk.commons.dict.wiktionary.generated.a.n.h;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryANH000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("anhalonine", "{\"term\":\"anhalonine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An alkaloid isolated from \u0027Lophophora williamsii\", \"priority\":1}]}, \"synonyms\":{}}");

	add("anharmonicity", "{\"term\":\"anharmonicity\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|anharmonic|ity|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The deviation of a system from harmonicity (being a harmonic oscillator\", \"priority\":1}]}, \"synonyms\":{}}");

	add("anhedonia", "{\"term\":\"anhedonia\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\", \"ancient greek (to 1453)\"], \"text\":\"From French \u0027anhédonie\u0027 (coined by w:Théodule-Armand Ribot|Ribot, 1896), from Ancient greek (to 1453) \u0027ἀν-\u0027 + \u0027ἡδονή\u0027 (pleasure)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The inability to feel pleasure from activities usually found enjoyable, such as exercise, hobbies, music, sexual activities or social interactions\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1902\u0027\u0027, William James, \u0027The Varieties of Religious Experience\u0027, Folio Society 2008, p. 123\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Sometimes it is mere passive joylessness and dreariness, discouragement, dejection, lack of taste and zest and spring. Professor Ribot has proposed the name \u0027\u0027\u0027anhedonia\u0027\u0027\u0027 to designate this condition\", \"priority\":3}]}, \"synonyms\":{}}");

	add("anhidrosis", "{\"term\":\"anhidrosis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|an|hidrosis|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The reduced ability or inability to sweat\", \"priority\":1}]}, \"synonyms\":{}}");

	add("anhydrase", "{\"term\":\"anhydrase\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|an|hydrase|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An enzyme that catalyzes the removal of water from a material\", \"priority\":1}]}, \"synonyms\":{}}");

	add("anhydride", "{\"term\":\"anhydride\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|an|hydride|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"any compound formally derived from another (or from others) by the loss of a water molecule, especially acid anhydrides\", \"priority\":1}]}, \"synonyms\":{}}");

	add("anhydrite", "{\"term\":\"anhydrite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A saline evaporite consisting of anhydrous calcium sulfate (gypsum\", \"priority\":1}]}, \"synonyms\":{}}");

	add("anhydrobiosis", "{\"term\":\"anhydrobiosis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{affix|en|an-|hydro-|-biosis}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A form of cryptobiosis that occurs in situations of extreme desiccation\", \"priority\":1}]}, \"synonyms\":{}}");

	add("anhydrotetracycline", "{\"term\":\"anhydrotetracycline\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A derivative of tetracycline, having no antibiotic activity, that is used in experimental genetics\", \"priority\":1}]}, \"synonyms\":{}}");

	add("anhydrovinblastine", "{\"term\":\"anhydrovinblastine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|an-|hydro-|vinblastine|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One of two vinca alkaloids useful in the treatment of cancer\", \"priority\":1}]}, \"synonyms\":{}}");

	add("anhypostasis", "{\"term\":\"anhypostasis\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) {{m|grc|ἀνῠπόστᾰσῐς||unsubstantiality}}, from {{prefix|nocat\u003d1|ἀν|ὑπόστᾰσῐς|t1\u003dnot|t2\u003dsubstance|lang\u003dgrc}}. Surface analysis: {{prefix|nocat\u003d1|an|hypostasis|t1\u003dnot|t2\u003dthe singular person of Christ|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A theologoumenon maintaining that the logos\u0027 human nature - a general humanity - did not subsist apart from the divine nature\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A theory characterizing Jesus as an eternal divine person with a related divine nature that \u0026quot;incarnates\u0026quot; via conjoining with an impersonal (anhypostasis) human nature (as opposed to a human person) and, therefore, necessarily denying that Jesus is a genuine man\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }