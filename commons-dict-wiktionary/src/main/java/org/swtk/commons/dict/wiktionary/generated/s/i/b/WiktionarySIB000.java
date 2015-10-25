package org.swtk.commons.dict.wiktionary.generated.s.i.b;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionarySIB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("siberia", "{\"term\":\"siberia\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Russian\"], \"text\":\"Adopted in the 17th century, from Russian \u0027сиби́рь\u0027 In origin the Tatar name of a 14th-century fortress at Qashliq (Tobolsk) which became the capital of the 16th-century \u0027Khanate of Sibir\u0027, in 16th century Russian usage extended to the entire area of what is now Tyumen Oblast, and with the ongoing Russian conquest of Siberia by the 19th century to the larger area of Russia\u0027s Asian territories beyond the Ob River.The figurative sense in English arises in the 19th century (attested in 1841 according to OED).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The region of Russia in Asia, stretching from the Urals to the Pacific Ocean\", \"priority\":1}]}, \"synonyms\":{}}");

	add("sibling", "{\"term\":\"sibling\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"middle english (1100-1500)\"], \"text\":\"1903, modern revival of Old english (ca. 450-1100) {{m|ang|sibling||relative, a relation, kinsman}}, equivalent to {{suffix|sib|ling|lang\u003den}}. Compare Middle english (1100-1500) \u0027sib\u0027 The term apparently meant merely kin or relative until the 20th century when its necessity for the study of genetics led to its specialized use. For example, the w:Oxford English Dictionary|OED has a 1903 citation in which \u0026quot;sibling\u0026quot; must be defined for those who don\u0027t know the intended meaning.: \u0026quot;1903 K. PEARSON in Biometrika II. 369 These [calculations] will enable us..to predict the probable character in any individual from a knowledge of one or more parents or brethren (‘siblings’, \u003d brothers or sisters).\u0026quot; (\u0026quot;Sibling,\u0026quot; OED.)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person who shares same parents. One\u0027s brother or sister\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"None of my \u0027\u0027siblings\u0027\u0027 are married yet\", \"priority\":2}]}, \"synonyms\":{}}");

	add("sibred", "{\"term\":\"sibred\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"middle english (1100-1500)\"], \"text\":\"From Middle english (1100-1500) \u0027sibrede\u0027 \u0027sibreden\u0027 from Old english (ca. 450-1100) {{m|ang|sibbrǣden||affinity, relationship}} equivalent to {{suffix|sib|red|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Relationship; kindred\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }