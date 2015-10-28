package org.swtk.commons.dict.wordnet.indexbyname.instance.e.c.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceECT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ect\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00707858\"]}");
	add("{\"term\":\"ectasia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14087526\"]}");
	add("{\"term\":\"ectasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14087526\"]}");
	add("{\"term\":\"ectoblast\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01466380\"]}");
	add("{\"term\":\"ectoderm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01466380\"]}");
	add("{\"term\":\"ectomorph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10064490\"]}");
	add("{\"term\":\"ectomorphy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05006276\"]}");
	add("{\"term\":\"ectoparasite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01387971\"]}");
	add("{\"term\":\"ectopia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05088867\"]}");
	add("{\"term\":\"ectopistes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01817776\"]}");
	add("{\"term\":\"ectoplasm\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05441432\", \"15134498\"]}");
	add("{\"term\":\"ectoproct\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02316810\"]}");
	add("{\"term\":\"ectoprocta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02316653\"]}");
	add("{\"term\":\"ectotherm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01318072\"]}");
	add("{\"term\":\"ectozoan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01387971\"]}");
	add("{\"term\":\"ectozoon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01387971\"]}");
	add("{\"term\":\"ectrodactyly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14116946\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }