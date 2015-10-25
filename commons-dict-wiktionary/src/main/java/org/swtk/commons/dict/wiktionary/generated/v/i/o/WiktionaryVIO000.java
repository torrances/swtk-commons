package org.swtk.commons.dict.wiktionary.generated.v.i.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryVIO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("viol", "{\"term\":\"viol\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"old provençal (to 1500)\"], \"text\":\"{{borrowing|frm|viole|lang\u003den}}, Old french (842-ca. 1400) {{m|fro|viol}}, from Old provençal (to 1500) {{m|pro|viola}} (modern Occitan {{m|oc|viula}}), from {{m|la|*vitula||stringed instrument}}. See {{m|en|viola}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A viola da gamba, a family of musical instruments that preceded the violin and viola and similar string instruments\", \"priority\":1}]}, \"synonyms\":{}}");

	add("violation", "{\"term\":\"violation\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"{{borrowing|frm|violation|lang\u003den}}, from Latin {{m|la|violātiō||injury, profanation}}, from {{m|la|violō||I treat with violence; I maltreat; I violate, defile, profane}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act or an instance of violating or the condition of being violated\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An infraction or a failure to follow a rule\", \"priority\":2}]}, \"synonyms\":{}}");

	add("violaxanthin", "{\"term\":\"violaxanthin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A xanthophyll pigment (a di-epoxide, derived from zeaxanthin) that occurs in many plants\", \"priority\":1}]}, \"synonyms\":{}}");

	add("violence", "{\"term\":\"violence\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"Latin\", \"anglo-norman\"], \"text\":\"From Anglo-norman and Old french (842-ca. 1400) {{m|fro|violence}}, from Latin {{m|la|violentia}}, from adjective {{m|la|violentus}}, see {{m|en|violent}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Extreme force\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Action which causes destruction, pain, or suffering\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"title\u003d[http://www.theguardian.com/global-development/2013/jul/12/war-denying-children-education Denied an education by passage\u003dOne particularly damaging, but often ignored, effect of conflict on education is the proliferation of attacks on schoolsas children, teachers or school buildings become the targets of attacks. Parents fear sending their children to school. Girls are particularly vulnerable to sexual \u0027\u0027violence\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Widespread fighting\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Injustice, wrong\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"ravishment; rape; violation\", \"priority\":6}]}, \"synonyms\":{}}");

	add("violetear", "{\"term\":\"violetear\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|violet|ear|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of the American hummingbirds of the genus \u0027Colibri\u0027, whose males have a violet-blue patch running back and down from the eye\", \"priority\":1}]}, \"synonyms\":{}}");

	add("violetness", "{\"term\":\"violetness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|violet|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or condition of being violet in colour\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1953\u0027\u0027, Daniel Marcus Mendelowitz, \u0027Children are Artists\u0027 (page 122\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Color has three dimensions of character: hue, which refers to its color identity (its redness, orangeness, yellowness, greenness, blueness, or \u0027\u0027violetness\", \"priority\":3}]}, \"synonyms\":{}}");

	add("violine", "{\"term\":\"violine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An emetocathartic alkaloid, of uncertain composition, obtained from violets\", \"priority\":1}]}, \"synonyms\":{}}");

	add("violoncellist", "{\"term\":\"violoncellist\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|violoncello|ist|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a person who plays the violoncello\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }