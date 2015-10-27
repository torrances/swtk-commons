package org.swtk.commons.dict.wordnet.index.name.instance.c.l.a.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCLAR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"clarence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03041575\"]}");
	add("{\"term\":\"claret\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07911410\", \"04971178\"]}");
	add("{\"term\":\"clarification\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00265035\", \"07185857\"]}");
	add("{\"term\":\"clarinet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03041694\"]}");
	add("{\"term\":\"clarinetist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09945704\"]}");
	add("{\"term\":\"clarinettist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09945704\"]}");
	add("{\"term\":\"clarion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03041884\"]}");
	add("{\"term\":\"clarity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04708808\", \"04827489\"]}");
	add("{\"term\":\"clark\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"10918301\", \"10918445\", \"10918681\", \"10918916\"]}");
	add("{\"term\":\"clarksburg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09178757\"]}");
	add("{\"term\":\"claro\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03042175\"]}");
	add("{\"term\":\"clary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12886922\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }