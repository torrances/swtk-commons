package org.swtk.commons.dict.wordnet.indexbyname.instance.t.a.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTAT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tat\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01010039\", \"04825691\"]}");
	add("{\"term\":\"tatahumara\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06931799\"]}");
	add("{\"term\":\"tatar\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06940005\", \"09664399\", \"09664724\"]}");
	add("{\"term\":\"tatary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08990741\"]}");
	add("{\"term\":\"tate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11352418\"]}");
	add("{\"term\":\"tater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07726361\"]}");
	add("{\"term\":\"tati\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11352567\"]}");
	add("{\"term\":\"tatou\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02458639\"]}");
	add("{\"term\":\"tatouay\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02458059\"]}");
	add("{\"term\":\"tatter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04053034\"]}");
	add("{\"term\":\"tatterdemalion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10524257\"]}");
	add("{\"term\":\"tatting\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00911370\", \"04402630\"]}");
	add("{\"term\":\"tattle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06818155\"]}");
	add("{\"term\":\"tattler\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02032941\", \"10712192\"]}");
	add("{\"term\":\"tattletale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10712192\"]}");
	add("{\"term\":\"tattletale gray\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04969866\"]}");
	add("{\"term\":\"tattletale grey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04969866\"]}");
	add("{\"term\":\"tattoo\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00264196\", \"04402786\", \"06818355\"]}");
	add("{\"term\":\"tatu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02458639\"]}");
	add("{\"term\":\"tatum\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11352683\", \"11352887\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }