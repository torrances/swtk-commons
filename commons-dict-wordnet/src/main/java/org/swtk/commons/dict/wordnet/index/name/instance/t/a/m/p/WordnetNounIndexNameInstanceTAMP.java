package org.swtk.commons.dict.wordnet.index.name.instance.t.a.m.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTAMP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tamp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04394793\"]}");
	add("{\"term\":\"tampa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09097834\"]}");
	add("{\"term\":\"tampax\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04395019\"]}");
	add("{\"term\":\"tamper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04394793\"]}");
	add("{\"term\":\"tampere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08798232\"]}");
	add("{\"term\":\"tampering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00202365\"]}");
	add("{\"term\":\"tampico\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08763734\"]}");
	add("{\"term\":\"tampion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04395127\"]}");
	add("{\"term\":\"tampon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04395249\"]}");
	add("{\"term\":\"tamponade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14531970\"]}");
	add("{\"term\":\"tamponage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14531970\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }