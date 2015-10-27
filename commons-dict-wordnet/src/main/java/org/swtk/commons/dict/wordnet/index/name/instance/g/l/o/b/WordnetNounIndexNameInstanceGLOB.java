package org.swtk.commons.dict.wordnet.index.name.instance.g.l.o.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGLOB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"glob\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07977630\"]}");
	add("{\"term\":\"globalisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13509313\"]}");
	add("{\"term\":\"globalization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13509313\"]}");
	add("{\"term\":\"globe\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03445436\", \"13922097\", \"09293800\"]}");
	add("{\"term\":\"globefish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02657650\"]}");
	add("{\"term\":\"globeflower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11759834\"]}");
	add("{\"term\":\"globetrotter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10152295\"]}");
	add("{\"term\":\"globicephala\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02074158\"]}");
	add("{\"term\":\"globigerina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01396127\"]}");
	add("{\"term\":\"globigerinidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01395878\"]}");
	add("{\"term\":\"globin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15050509\"]}");
	add("{\"term\":\"globosity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05080300\"]}");
	add("{\"term\":\"globularness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05080300\"]}");
	add("{\"term\":\"globule\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09312615\"]}");
	add("{\"term\":\"globulin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15046738\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }