package org.swtk.commons.dict.wordnet.index.name.instance.h.a.m.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHAMM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hammarskjold\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11046368\"]}");
	add("{\"term\":\"hammer\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"01177806\", \"03486604\", \"03486757\", \"03487084\", \"03721208\", \"05333491\", \"03486255\", \"03486907\"]}");
	add("{\"term\":\"hammerhead\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01497116\", \"03487211\", \"10059388\"]}");
	add("{\"term\":\"hammering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01177806\"]}");
	add("{\"term\":\"hammerlock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00815636\"]}");
	add("{\"term\":\"hammerstein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11046593\"]}");
	add("{\"term\":\"hammertoe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05585497\"]}");
	add("{\"term\":\"hammett\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11046812\"]}");
	add("{\"term\":\"hamming\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00552622\"]}");
	add("{\"term\":\"hammock\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03487335\", \"09349568\"]}");
	add("{\"term\":\"hammurabi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11046977\"]}");
	add("{\"term\":\"hammurapi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11046977\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }