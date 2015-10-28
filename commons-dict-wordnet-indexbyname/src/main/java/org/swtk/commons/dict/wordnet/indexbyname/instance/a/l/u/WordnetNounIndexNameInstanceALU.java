package org.swtk.commons.dict.wordnet.indexbyname.instance.a.l.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceALU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"alula\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01900308\", \"02193117\"]}");
	add("{\"term\":\"alum\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02703481\", \"09805779\", \"14652297\", \"14652485\"]}");
	add("{\"term\":\"alumbloom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12819044\"]}");
	add("{\"term\":\"alumina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14848114\"]}");
	add("{\"term\":\"aluminate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14848310\"]}");
	add("{\"term\":\"aluminium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14651998\"]}");
	add("{\"term\":\"aluminum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14651998\"]}");
	add("{\"term\":\"alumna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09805779\"]}");
	add("{\"term\":\"alumnus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09805779\"]}");
	add("{\"term\":\"alumroot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12819044\"]}");
	add("{\"term\":\"alundum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14848639\"]}");
	add("{\"term\":\"alupent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03758140\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }