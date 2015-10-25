package org.swtk.commons.dict.wiktionary.generated.v.a.s;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryVAS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("vase", "{\"term\":\"vase\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle french (ca. 1400-1600)\", \"Latin\"], \"text\":\"From Middle french (ca. 1400-1600) \u0027vase\u0027 from Latin \u0027vas\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A container used mainly for displaying fresh, dried, or artificial flowers\", \"priority\":1}]}, \"synonyms\":{}}");

	add("vasculoprotection", "{\"term\":\"vasculoprotection\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The protection of the vascular system from damage\", \"priority\":1}]}, \"synonyms\":{}}");

	add("vasculose", "{\"term\":\"vasculose\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One of the substances of which vegetable tissue is composed, differing from cellulose in its solubility in certain media\", \"priority\":1}]}, \"synonyms\":{}}");

	add("vasectomy", "{\"term\":\"vasectomy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|vas|ectomy|lang\u003den}}{{rfe|what is vas, what is ectomy, where do they come from?|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The surgical removal of all or part of the vas deferens, usually as a means of male sterilization\", \"priority\":1}]}, \"synonyms\":{}}");

	add("vasocongestion", "{\"term\":\"vasocongestion\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The swelling of bodily tissues caused by increased vascular blood flow and a localized increase in blood pressure\", \"priority\":1}]}, \"synonyms\":{}}");

	add("vasodilatation", "{\"term\":\"vasodilatation\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|vaso|dilatation|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"dilatation of a blood vessel\", \"priority\":1}]}, \"synonyms\":{}}");

	add("vasodilator", "{\"term\":\"vasodilator\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|vaso|dilator|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A drug or chemical agent that causes dilation of the blood vessels thereby reducing blood pressure\", \"priority\":1}]}, \"synonyms\":{}}");

	add("vasospasm", "{\"term\":\"vasospasm\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|vaso|spasm|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Spasm of the blood vessels, leading to vasoconstriction and potentially tissue ischemia and necrosis\", \"priority\":1}]}, \"synonyms\":{}}");

	add("vassal", "{\"term\":\"vassal\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle english (1100-1500)\", \"old french (842-ca. 1400)\"], \"text\":\"From Middle english (1100-1500) from Old french (842-ca. 1400) \u0027vassal\u0027 () from \u0027vassallus\u0027 (lang\u003dla) from \u0027vassus\u0027 (lang\u003dla) from Gaulish {{m|cel-gau|*wassos||young man, squire}}, from Proto-celtic {{m|cel-pro|*wastos||servant}} (compare Old Irish \u0027foss\u0027 and Welsh \u0027gwas\u0027 .\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The grantee of a fief, feud, or fee; one who keeps land of a superior, and who vows fidelity and homage to him, normally a lord of a manor; a feudatory; a feudal tenant\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A subject; a dependant; a servant; a slave\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Milto\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027vassals\u0027\u0027 of his anger\", \"priority\":4}]}, \"synonyms\":{}}");

	add("vassalage", "{\"term\":\"vassalage\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\"], \"text\":\"From Old french (842-ca. 1400) Old French|vassalage\u0027 (French \u0027vasselage\u0027), from \u0027vassal\u0027.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state of being a vassal\", \"priority\":1}]}, \"synonyms\":{}}");

	add("vastness", "{\"term\":\"vastness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|vast|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality of being vast\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"title\u003d[http://openlibrary.org/works/OL1097634W The Mirror and the passage\u003dHe was thinking; but the glory of the song, the swell from the great organ, the clustered lights, […], the height and \u0027\u0027vastness\u0027\u0027 of this noble fane, its antiquity and its strength—all these things seemed to have their part as causes of the thrilling emotion that accompanied his thoughts\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Something vast\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }