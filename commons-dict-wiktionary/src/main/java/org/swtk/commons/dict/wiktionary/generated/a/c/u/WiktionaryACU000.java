package org.swtk.commons.dict.wiktionary.generated.a.c.u;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryACU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("acuation", "{\"term\":\"acuation\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act of sharpening\", \"priority\":1}]}, \"synonyms\":{}}");

	add("acuition", "{\"term\":\"acuition\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act of sharpening\", \"priority\":1}]}, \"synonyms\":{}}");

	add("acumen", "{\"term\":\"acumen\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin {{m|la|acūmen||sharp point}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Quickness of perception or discernment; penetration of mind; the faculty of nice discrimination\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"chapter\u003d2|passage\u003dSunning himself on the board steps, I saw for the first time Mr. Farquhar Fenelon Cooke.A silver snaffle on a heavy leather watch guard which connected the pockets of his corduroy waistcoat, together with a huge gold stirrup in his Ascot tie, sufficiently proclaimed his tastes.But withal there was a perceptible \u0027\u0027acumen\u0027\u0027 about the man which was puzzling in the extreme\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"w:Arthur Conan Sir Arthur Conan Doyle in \u0027wikisource:The Adventure of the Missing The Adventure of the Missing Three-Quarte\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"No, no, my dear Watson! With all respect for your natural \u0027\u0027acumen\u0027\u0027, I do not think that you are quite a match for the worthy doctor\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"1991\u0027\u0027, \u0027w:The Silence of the Lambs Silence Of The Lambs\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Hannibal Lecter: \u0027Why do you think he removes their skins, Agent Starling? Enthrall me with your \u0027\u0027acumen\", \"priority\":6}]}, \"synonyms\":{}}");

	add("acupressure", "{\"term\":\"acupressure\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|acupuncture|pressure|lang\u003den}}?\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An alternative medicine technique, derived from acupuncture, in which physical pressure is applied to acupoints\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A mode of arresting hemorrhage resulting from wounds or surgical operations, by passing under the divided vessel a needle, the ends of which are left exposed externally on the cutaneous surface\", \"priority\":2}]}, \"synonyms\":{}}");

	add("acutance", "{\"term\":\"acutance\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|acute|ance|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"thumb|250px|Demonstration of increasing acutance by adding a borde\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Edge contrast in an image; a component of sharpness\", \"priority\":2}]}, \"synonyms\":{}}");

	add("acuteness", "{\"term\":\"acuteness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|acute|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality of being acute or pointed; as, the acuteness of an angle\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The faculty of nice discernment or perception; sensitiveness; – applied to the senses, or the understanding. By acuteness of feeling, we perceive small objects or slight impressions: by acuteness of intellect, we discern nice distinctions\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Shrillness; high pitch; – said of sounds\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Violence of a disease, which brings it speedily to a crisis\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Shrewdness, quickness of mind\", \"priority\":5}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }