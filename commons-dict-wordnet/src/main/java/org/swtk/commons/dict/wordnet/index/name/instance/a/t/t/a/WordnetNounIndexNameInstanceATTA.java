package org.swtk.commons.dict.wordnet.index.name.instance.a.t.t.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceATTA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"attacapa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06920343\"]}");
	add("{\"term\":\"attacapan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06920343\", \"09667518\"]}");
	add("{\"term\":\"attache\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02758145\", \"09840488\"]}");
	add("{\"term\":\"attachment\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00148415\", \"00380230\", \"01215372\", \"02758357\", \"06566972\", \"02758249\", \"07560531\"]}");
	add("{\"term\":\"attack\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"01223108\", \"13456721\", \"14104857\", \"00237820\", \"00775311\", \"00942956\", \"06724098\", \"00458747\", \"00974725\"]}");
	add("{\"term\":\"attacker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09840655\"]}");
	add("{\"term\":\"attainability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14506028\"]}");
	add("{\"term\":\"attainableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14506028\"]}");
	add("{\"term\":\"attainder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00233632\"]}");
	add("{\"term\":\"attainment\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05645403\", \"00049397\", \"00063626\"]}");
	add("{\"term\":\"attalea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12605731\"]}");
	add("{\"term\":\"attar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14917140\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }