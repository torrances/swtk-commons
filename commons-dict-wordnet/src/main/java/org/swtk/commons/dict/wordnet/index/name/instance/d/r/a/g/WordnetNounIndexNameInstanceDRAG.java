package org.swtk.commons.dict.wordnet.index.name.instance.d.r.a.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDRAG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"drag\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00115691\", \"00839336\", \"03236179\", \"05213713\", \"05697896\", \"11525316\"]}");
	add("{\"term\":\"dragee\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03236426\", \"07620807\", \"07620891\"]}");
	add("{\"term\":\"dragger\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04483351\", \"10511787\"]}");
	add("{\"term\":\"dragnet\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04482984\", \"08450871\"]}");
	add("{\"term\":\"dragoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10049154\"]}");
	add("{\"term\":\"dragon\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01691230\", \"09292623\", \"10049454\", \"09517519\"]}");
	add("{\"term\":\"dragonet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02621457\"]}");
	add("{\"term\":\"dragonfly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02271095\"]}");
	add("{\"term\":\"dragonhead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12867095\"]}");
	add("{\"term\":\"dragoon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10049556\"]}");
	add("{\"term\":\"dragunov\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03236522\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }