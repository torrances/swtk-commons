package org.swtk.commons.dict.wordnet.index.name.instance.m.i.n.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMINE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mine\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03773667\", \"03773881\"]}");
	add("{\"term\":\"minefield\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08524276\"]}");
	add("{\"term\":\"minelayer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03774358\"]}");
	add("{\"term\":\"minelaying\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00964073\"]}");
	add("{\"term\":\"miner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10339454\"]}");
	add("{\"term\":\"mineral\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14686753\"]}");
	add("{\"term\":\"mineralocorticoid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14776042\"]}");
	add("{\"term\":\"mineralogist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10339654\"]}");
	add("{\"term\":\"mineralogy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06130720\"]}");
	add("{\"term\":\"minerva\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09580761\"]}");
	add("{\"term\":\"mineshaft\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03774451\"]}");
	add("{\"term\":\"minestrone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07602465\"]}");
	add("{\"term\":\"minesweeper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03774635\"]}");
	add("{\"term\":\"minesweeping\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00092599\"]}");
	add("{\"term\":\"mineworker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10339454\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }