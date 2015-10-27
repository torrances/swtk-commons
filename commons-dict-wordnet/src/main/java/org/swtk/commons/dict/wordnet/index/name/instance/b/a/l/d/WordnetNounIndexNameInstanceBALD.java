package org.swtk.commons.dict.wordnet.index.name.instance.b.a.l.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBALD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"baldachin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02781136\"]}");
	add("{\"term\":\"balder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09602665\"]}");
	add("{\"term\":\"balderdash\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06620496\"]}");
	add("{\"term\":\"baldhead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09853256\"]}");
	add("{\"term\":\"baldness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14480489\"]}");
	add("{\"term\":\"baldpate\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01851481\", \"09853256\"]}");
	add("{\"term\":\"baldr\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09602665\"]}");
	add("{\"term\":\"baldric\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02781299\"]}");
	add("{\"term\":\"baldrick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02781299\"]}");
	add("{\"term\":\"baldwin\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07755899\", \"10851681\", \"10851847\"]}");
	add("{\"term\":\"baldy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09853256\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }