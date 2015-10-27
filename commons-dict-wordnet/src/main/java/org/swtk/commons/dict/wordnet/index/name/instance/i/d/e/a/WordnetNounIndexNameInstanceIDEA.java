package org.swtk.commons.dict.wordnet.index.name.instance.i.d.e.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceIDEA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"idea\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"07042734\", \"05811387\", \"05846174\", \"05991800\", \"05842164\"]}");
	add("{\"term\":\"ideal\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10344909\", \"05932328\"]}");
	add("{\"term\":\"idealisation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01221565\", \"05933040\", \"13516839\"]}");
	add("{\"term\":\"idealism\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04877838\", \"05159943\", \"05980970\"]}");
	add("{\"term\":\"idealist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10216584\"]}");
	add("{\"term\":\"ideality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04862755\"]}");
	add("{\"term\":\"idealization\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05933040\", \"13516839\", \"01221565\"]}");
	add("{\"term\":\"idealogue\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10726461\"]}");
	add("{\"term\":\"ideation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05792704\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }