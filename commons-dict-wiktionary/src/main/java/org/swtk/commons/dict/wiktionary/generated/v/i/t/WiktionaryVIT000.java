package org.swtk.commons.dict.wiktionary.generated.v.i.t;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryVIT000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("vitalism", "{\"term\":\"vitalism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|vital|ism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The doctrine that life involves some immaterial \u0026quot;vital force\u0026quot;, and cannot be explained scientifically\", \"priority\":1}]}, \"synonyms\":{}}");

	add("vitality", "{\"term\":\"vitality\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"middle french (ca. 1400-1600)\", \"Latin\"], \"text\":\"From Middle french (ca. 1400-1600) \u0027vitalité\u0027 from Latin \u0027vitalitas\u0027 (vital force, life) from \u0027vitalis\u0027 (vital) see vital.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The capacity to live and develop\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Energy or vigour\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"That which distinguishes living from nonliving things; life, animateness\", \"priority\":3}]}, \"synonyms\":{}}");

	add("vitamer", "{\"term\":\"vitamer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|vitamin|mer|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of a combination of substances that, together, function as a vitamin\", \"priority\":1}]}, \"synonyms\":{}}");

	add("vitrectomy", "{\"term\":\"vitrectomy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|vitreous|ectomy|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The surgical removal of some or all of the vitreous humour from the eye\", \"priority\":1}]}, \"synonyms\":{}}");

	add("vitrification", "{\"term\":\"vitrification\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"Latin\"], \"text\":\"Latin \u0027vitrum\u0027 (glass)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A process of converting a material into a glass-like amorphous solid which is free of any crystalline structure, either by the quick removal or addition of heat, or by mixing with an additive\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"page\u003d15|passage\u003dAt this point overfiring begins, as is shown particularly by the volume curve, which indicates decided bloating, so that at 1450°C the clay has about the same volume it had at 1050°C before \u0027\u0027vitrification\u0027\u0027 took place\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }