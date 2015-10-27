package org.swtk.commons.dict.wordnet.index.name.instance.s.p.a.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSPAR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"spar\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00447789\", \"04274687\", \"15073663\"]}");
	add("{\"term\":\"sparaxis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12438861\"]}");
	add("{\"term\":\"spare\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00188739\", \"03339857\", \"04274980\"]}");
	add("{\"term\":\"spareness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05008647\", \"05122081\"]}");
	add("{\"term\":\"sparer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10649182\"]}");
	add("{\"term\":\"sparerib\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07672570\"]}");
	add("{\"term\":\"spareribs\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07687204\", \"07878324\"]}");
	add("{\"term\":\"sparganiaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12176825\"]}");
	add("{\"term\":\"sparganium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12177001\"]}");
	add("{\"term\":\"sparge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00279399\"]}");
	add("{\"term\":\"sparid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02593125\"]}");
	add("{\"term\":\"sparidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02592867\"]}");
	add("{\"term\":\"spark\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"09465245\", \"11329608\", \"13795739\", \"11531956\", \"04960557\", \"07426910\"]}");
	add("{\"term\":\"sparker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04275252\"]}");
	add("{\"term\":\"sparkle\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04960121\", \"07427268\", \"04960557\"]}");
	add("{\"term\":\"sparkleberry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12267290\"]}");
	add("{\"term\":\"sparkler\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04276079\", \"13393296\"]}");
	add("{\"term\":\"sparkling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07426245\"]}");
	add("{\"term\":\"sparling\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02543614\", \"07814848\"]}");
	add("{\"term\":\"sparmannia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12225825\"]}");
	add("{\"term\":\"sparring\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00447789\", \"07197404\"]}");
	add("{\"term\":\"sparrow\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01529988\", \"01542214\"]}");
	add("{\"term\":\"sparseness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05122081\"]}");
	add("{\"term\":\"sparsity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05122081\"]}");
	add("{\"term\":\"sparta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08805092\"]}");
	add("{\"term\":\"spartan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09731057\"]}");
	add("{\"term\":\"spartina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12159884\"]}");
	add("{\"term\":\"spartium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12591699\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }