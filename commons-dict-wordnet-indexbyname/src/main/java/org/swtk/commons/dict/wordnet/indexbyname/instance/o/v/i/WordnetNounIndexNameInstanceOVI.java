package org.swtk.commons.dict.wordnet.indexbyname.instance.o.v.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOVI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ovibos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02413721\"]}");
	add("{\"term\":\"ovibos moschatus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02413852\"]}");
	add("{\"term\":\"ovid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11238766\"]}");
	add("{\"term\":\"oviduct\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05526521\"]}");
	add("{\"term\":\"oviedo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09049150\"]}");
	add("{\"term\":\"ovimbundu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08501532\"]}");
	add("{\"term\":\"ovipositor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01463454\"]}");
	add("{\"term\":\"oviraptorid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01719870\"]}");
	add("{\"term\":\"ovis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02414073\"]}");
	add("{\"term\":\"ovis ammon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02417409\"]}");
	add("{\"term\":\"ovis aries\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02415777\"]}");
	add("{\"term\":\"ovis canadensis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02418223\"]}");
	add("{\"term\":\"ovis montana dalli\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02417899\"]}");
	add("{\"term\":\"ovis musimon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02418475\"]}");
	add("{\"term\":\"ovis poli\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02417550\"]}");
	add("{\"term\":\"ovis vignei\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02417776\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }