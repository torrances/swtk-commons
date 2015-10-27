package org.swtk.commons.dict.wordnet.index.name.instance.f.l.a.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFLAG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"flag\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"02161498\", \"03360185\", \"03947170\", \"06888144\", \"12432427\", \"06505149\", \"03359749\"]}");
	add("{\"term\":\"flagellant\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10114089\", \"10114213\"]}");
	add("{\"term\":\"flagellata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01418995\"]}");
	add("{\"term\":\"flagellate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01419226\"]}");
	add("{\"term\":\"flagellation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01165537\", \"01165806\"]}");
	add("{\"term\":\"flagellum\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01460943\", \"04157033\"]}");
	add("{\"term\":\"flageolet\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03360314\", \"07743717\"]}");
	add("{\"term\":\"flagfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01450587\"]}");
	add("{\"term\":\"flagging\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03360487\", \"07972726\"]}");
	add("{\"term\":\"flagon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03360614\"]}");
	add("{\"term\":\"flagpole\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03360771\", \"04060879\"]}");
	add("{\"term\":\"flagroot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11801399\"]}");
	add("{\"term\":\"flagship\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03360884\", \"03361004\"]}");
	add("{\"term\":\"flagstaff\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03360771\", \"09080393\"]}");
	add("{\"term\":\"flagstone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03360185\"]}");
	add("{\"term\":\"flagyl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03762957\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }