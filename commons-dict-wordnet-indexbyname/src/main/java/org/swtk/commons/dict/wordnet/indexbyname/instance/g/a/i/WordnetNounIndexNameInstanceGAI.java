package org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGAI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gaia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09583891\"]}");
	add("{\"term\":\"gaiety\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07527278\", \"07544633\"]}");
	add("{\"term\":\"gaillardia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11991055\"]}");
	add("{\"term\":\"gain\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"13275704\", \"05116624\", \"05164957\", \"13776433\"]}");
	add("{\"term\":\"gainer\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00444902\", \"10137168\", \"10137396\"]}");
	add("{\"term\":\"gainesville\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09095643\"]}");
	add("{\"term\":\"gainfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05165249\"]}");
	add("{\"term\":\"gainsborough\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11007040\"]}");
	add("{\"term\":\"gaiseric\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11014496\"]}");
	add("{\"term\":\"gait\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00287341\", \"00287801\", \"15305715\"]}");
	add("{\"term\":\"gaiter\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03415848\", \"03415989\", \"04276932\"]}");
	add("{\"term\":\"gaius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10899303\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }