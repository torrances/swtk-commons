package org.swtk.commons.dict.wordnet.index.name.instance.t.h.r.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTHRI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"thrift\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04900720\", \"12119344\"]}");
	add("{\"term\":\"thriftiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04900982\"]}");
	add("{\"term\":\"thriftlessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04902159\"]}");
	add("{\"term\":\"thriftshop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04435769\"]}");
	add("{\"term\":\"thrill\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01263786\", \"07535351\", \"07543858\"]}");
	add("{\"term\":\"thriller\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06382026\"]}");
	add("{\"term\":\"thrinax\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12618401\"]}");
	add("{\"term\":\"thrip\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02274549\"]}");
	add("{\"term\":\"thripid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02274549\"]}");
	add("{\"term\":\"thripidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02274392\"]}");
	add("{\"term\":\"thrips\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02274549\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }