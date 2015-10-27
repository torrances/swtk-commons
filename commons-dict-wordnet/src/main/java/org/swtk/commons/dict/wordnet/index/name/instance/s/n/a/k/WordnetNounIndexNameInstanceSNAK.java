package org.swtk.commons.dict.wordnet.index.name.instance.s.n.a.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSNAK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"snake\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"03975218\", \"04255138\", \"09330458\", \"09461458\", \"10635218\", \"01729333\"]}");
	add("{\"term\":\"snakeberry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11744578\"]}");
	add("{\"term\":\"snakebird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02057156\"]}");
	add("{\"term\":\"snakebite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14311149\"]}");
	add("{\"term\":\"snakeblenny\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02618610\"]}");
	add("{\"term\":\"snakefish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02546196\"]}");
	add("{\"term\":\"snakefly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02269860\"]}");
	add("{\"term\":\"snakehead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12901865\"]}");
	add("{\"term\":\"snakeroot\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12011732\", \"12964203\"]}");
	add("{\"term\":\"snakeweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11995026\"]}");
	add("{\"term\":\"snakewood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11796095\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }