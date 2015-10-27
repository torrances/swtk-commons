package org.swtk.commons.dict.wordnet.index.name.instance.a.q.u.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAQUA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"aqua\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04976975\"]}");
	add("{\"term\":\"aquaculture\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00917978\"]}");
	add("{\"term\":\"aqualung\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02734634\"]}");
	add("{\"term\":\"aquamarine\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04976975\", \"14791842\"]}");
	add("{\"term\":\"aquanaut\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09820794\", \"10626699\"]}");
	add("{\"term\":\"aquaphobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14406372\"]}");
	add("{\"term\":\"aquaplane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02734905\"]}");
	add("{\"term\":\"aquarium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02735077\"]}");
	add("{\"term\":\"aquarius\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08705622\", \"09224718\", \"09772973\"]}");
	add("{\"term\":\"aquatic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11557124\"]}");
	add("{\"term\":\"aquatics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00442764\"]}");
	add("{\"term\":\"aquatint\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00940907\", \"02735300\"]}");
	add("{\"term\":\"aquavit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07919039\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }