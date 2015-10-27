package org.swtk.commons.dict.wordnet.index.name.instance.p.o.t.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePOTA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"potable\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07897775\"]}");
	add("{\"term\":\"potage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07602594\"]}");
	add("{\"term\":\"potamogale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01897597\"]}");
	add("{\"term\":\"potamogalidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01897311\"]}");
	add("{\"term\":\"potamogeton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12636747\"]}");
	add("{\"term\":\"potamogetonaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12636188\"]}");
	add("{\"term\":\"potamophis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01739210\"]}");
	add("{\"term\":\"potash\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15021410\"]}");
	add("{\"term\":\"potassium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14674986\"]}");
	add("{\"term\":\"potation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00845236\", \"07899955\"]}");
	add("{\"term\":\"potato\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12918253\", \"07726361\"]}");
	add("{\"term\":\"potawatomi\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06924633\", \"09686054\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }