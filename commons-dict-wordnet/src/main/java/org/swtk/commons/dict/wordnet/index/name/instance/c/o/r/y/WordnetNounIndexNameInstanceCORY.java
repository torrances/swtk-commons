package org.swtk.commons.dict.wordnet.index.name.instance.c.o.r.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCORY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"coryanthes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12074968\"]}");
	add("{\"term\":\"corydalidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02268369\"]}");
	add("{\"term\":\"corydalis\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02268512\", \"11924350\", \"11924578\"]}");
	add("{\"term\":\"corydalus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02268512\"]}");
	add("{\"term\":\"corylaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12308939\"]}");
	add("{\"term\":\"corylopsis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12335941\"]}");
	add("{\"term\":\"corylus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12309115\"]}");
	add("{\"term\":\"corymb\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13152041\"]}");
	add("{\"term\":\"corynebacteriaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01368656\"]}");
	add("{\"term\":\"corynebacterium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01368917\"]}");
	add("{\"term\":\"corypha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12610047\"]}");
	add("{\"term\":\"coryphaenidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02584434\"]}");
	add("{\"term\":\"coryphantha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11865746\"]}");
	add("{\"term\":\"corythosaur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01709327\"]}");
	add("{\"term\":\"corythosaurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01709327\"]}");
	add("{\"term\":\"coryza\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14378465\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }