package org.swtk.commons.dict.wiktionary.generated.v.a.n;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryVAN000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("vancomycin", "{\"term\":\"vancomycin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|vanco-|-mycin|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A glycopeptide antibiotic, produced by the actinomycete \u0027Amycolaptosis orientalis\u0027, used against Gram-positive bacteria, especially staphylococci and enterococci\", \"priority\":1}]}, \"synonyms\":{}}");

	add("vancouverite", "{\"term\":\"vancouverite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Vancouver|ite|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A native or resident of Vancouver, British Columbia, Canada\", \"priority\":1}]}, \"synonyms\":{}}");

	add("vanillin", "{\"term\":\"vanillin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|vanilla|in|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The name of a chemical compound, 4-hydroxy-3-methoxybenzaldehyde, which is the primary constituent of vanilla\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Synthetic compound used as a substitute for the extract of the vanilla bean\", \"priority\":2}]}, \"synonyms\":{}}");

	add("vanillism", "{\"term\":\"vanillism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|vanilla|ism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A form of dermatitis caused by flour mites, associated with the vanilla industry\", \"priority\":1}]}, \"synonyms\":{}}");

	add("vanishment", "{\"term\":\"vanishment\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|vanish|ment|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act or process of vanishing; disappearance\", \"priority\":1}]}, \"synonyms\":{}}");

	add("vanity", "{\"term\":\"vanity\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle english (1100-1500)\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From Middle english (1100-1500) \u0027vanite\u0027 from Old french (842-ca. 1400) \u0027vanité\u0027 from Latin \u0027vanitas\u0027 () from Latin \u0027vanus\u0027 whence English \u0027vain\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"That which is vain, futile, or worthless; that which is of no value, use or profit\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Excessive pride in or admiration of one\u0027s own abilities, appearance or achievements\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A dressing table used to apply makeup, preen, and coif hair. The table is normally quite low and similar to a desk, with drawers and one or more mirrors on top. Either a chair or bench is used to sit upon\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A washbasin installed into a permanently fixed storage unit, used as an item of bathroom furniture\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Emptiness\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Any idea, theory or statement that is without foundation\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"It is a \u0027\u0027vanity\u0027\u0027 to say that if two stones are dropped from a tower, the heavier will experience the greater acceleration\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"Francis Baco\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"To help the matter, the alchemists call in many \u0027\u0027vanities\u0027\u0027 out of astrology\", \"priority\":9}]}, \"synonyms\":{}}");

	add("vanner", "{\"term\":\"vanner\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|van|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who owns and drives a van\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A machine for concentrating ore\", \"priority\":2}]}, \"synonyms\":{}}");

	add("vantage", "{\"term\":\"vantage\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle english (1100-1500)\"], \"text\":\"From Middle english (1100-1500) {{m|enm|vantage}}, by apheresis from {{m|en|advantage}}; see advantage.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An advantage\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A place or position affording a good view; a vantage point\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A superior or more favorable situation or opportunity; gain; profit; advantage\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"William Shakespeare, \u0027The Life and Death of Richard the Second\u0027 ActV, scene III\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"O happy \u0027\u0027vantage\u0027\u0027 of a kneeling knee\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"score after deuce\", \"priority\":6}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }