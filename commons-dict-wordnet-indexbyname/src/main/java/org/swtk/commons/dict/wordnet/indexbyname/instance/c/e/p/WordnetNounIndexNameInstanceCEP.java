package org.swtk.commons.dict.wordnet.indexbyname.instance.c.e.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCEP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cephalalgia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14350016\"]}");
	add("{\"term\":\"cephalanthera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12071235\"]}");
	add("{\"term\":\"cephalaspid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01478289\"]}");
	add("{\"term\":\"cephalaspida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01478062\"]}");
	add("{\"term\":\"cephalexin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02999856\"]}");
	add("{\"term\":\"cephalhematoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14341979\"]}");
	add("{\"term\":\"cephalitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14365537\"]}");
	add("{\"term\":\"cephalobidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01934486\"]}");
	add("{\"term\":\"cephalochordata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01469821\"]}");
	add("{\"term\":\"cephalochordate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01469977\"]}");
	add("{\"term\":\"cephaloglycin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03000177\"]}");
	add("{\"term\":\"cephalohematoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14341979\"]}");
	add("{\"term\":\"cephalometry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01003865\"]}");
	add("{\"term\":\"cephalopod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01970956\"]}");
	add("{\"term\":\"cephalopoda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01970756\"]}");
	add("{\"term\":\"cephalopterus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01554833\"]}");
	add("{\"term\":\"cephaloridine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03000310\"]}");
	add("{\"term\":\"cephalosporin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03000447\"]}");
	add("{\"term\":\"cephalotaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12805303\"]}");
	add("{\"term\":\"cephalotaxaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11668879\"]}");
	add("{\"term\":\"cephalotaxus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11669068\"]}");
	add("{\"term\":\"cephalothin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03000899\"]}");
	add("{\"term\":\"cephalotus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12805498\"]}");
	add("{\"term\":\"cepheus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09263178\", \"09520772\"]}");
	add("{\"term\":\"cepphus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02049267\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }