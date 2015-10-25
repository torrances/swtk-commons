package org.swtk.commons.dict.wiktionary.generated.s.o.t;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionarySOT000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("soteriology", "{\"term\":\"soteriology\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027σωτηρία\u0027 (salvation) from \u0027σωτήρ\u0027 (savior)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The study or doctrine of salvation\", \"priority\":1}]}, \"synonyms\":{}}");

	add("sotho", "{\"term\":\"sotho\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A group of closely related Bantu lects spoken in South Africa, Lesotho, Botswana, and Zambia\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Sesotho\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A \u0027\u0027Mosotho\", \"priority\":3}]}, \"synonyms\":{}}");

	add("sotol", "{\"term\":\"sotol\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Spanish\", \"classical nahuatl\"], \"text\":\"From Mexican Spanish \u0027sotol\u0027 from Classical nahuatl \u0027zōtolin\u0027 (palm tree)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of several species of North American desert plants of the genus , of the asparagus family\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A distilled spirit made from the sap of some of these plants, especially .Category:en:Asparagus family plantsCategory:en:Distilled beverages\", \"priority\":2}]}, \"synonyms\":{}}");

	add("sotolon", "{\"term\":\"sotolon\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A lactone and extremely powerful aroma compound, which smells of fenugreek or curry at high concentrations and maple syrup or caramel at lower concentrations\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }