package org.swtk.commons.dict.wordnet.index.name.instance.t.a.x.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTAXI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"taxi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02934150\"]}");
	add("{\"term\":\"taxicab\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02934150\"]}");
	add("{\"term\":\"taxidea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02450222\"]}");
	add("{\"term\":\"taxidermist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10712955\"]}");
	add("{\"term\":\"taxidermy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05644247\"]}");
	add("{\"term\":\"taxidriver\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10713142\"]}");
	add("{\"term\":\"taximan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10713142\"]}");
	add("{\"term\":\"taximeter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04403470\"]}");
	add("{\"term\":\"taxis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00694244\", \"00864364\"]}");
	add("{\"term\":\"taxistand\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08535244\"]}");
	add("{\"term\":\"taxiway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04403601\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }