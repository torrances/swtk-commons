package org.swtk.commons.dict.wiktionary.generated.c.a.k;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryCAK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("cakehole", "{\"term\":\"cakehole\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|cake|hole|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The mouth\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Shut your \u0027\u0027cakehole\", \"priority\":2}]}, \"synonyms\":{}}");

	add("cakewalk", "{\"term\":\"cakewalk\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Originally a form of dance that white masters had their slaves perform for them and their audiences as entertainment. The slaveowners considered the spectacle extremely amusing since the dances derived from sophisticated white European aristocracy. As such, slaveowners dressed the slaves in costumes of exaggerated finery, like ridiculously tall tophats and flashy striped pants, and taught the slaves variations of the original dance steps designed as highly comical parodies. Audiences selected their favorites, and the slaves who performed most entertainingly for their masters were rewarded with a piece of cake.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A contest in which cake was offered for the best dancers\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The style of music associated with such a contest\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The dance, or style of dance associated with such a contest\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Something that is easy or simple, or that does not present a great challenge\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"1899\u0027\u0027, w:Willa Willa Cather, \u0027w:The Westbound The Westbound Train\u0027 [http://libtextcenter.unl.edu/cather/writings/shortfiction/westbound.html\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Just as common as she is, a \u0027\u0027cakewalk\u0027\u0027 sort of a name\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"1995\u0027\u0027, w:Richard Richard Powers, \u0027w:Galatea Galatea 2.2\u0027, ISBN 0374199485\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"Nah. The first step’s a \u0027\u0027cakewalk\u0027\u0027. We can beat the hell out of a developing infant, in any case\", \"priority\":8}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }