package org.swtk.commons.dict.wordnet.index.name.instance.c.a.l.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCALC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"calcaneus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05282307\"]}");
	add("{\"term\":\"calcedony\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14830503\"]}");
	add("{\"term\":\"calceolaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12900287\"]}");
	add("{\"term\":\"calceus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02941602\"]}");
	add("{\"term\":\"calciferol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15116794\"]}");
	add("{\"term\":\"calcification\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"14034879\", \"14388385\", \"13463485\"]}");
	add("{\"term\":\"calcimine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02941705\"]}");
	add("{\"term\":\"calcination\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13463649\"]}");
	add("{\"term\":\"calcite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14959889\"]}");
	add("{\"term\":\"calcitonin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05420808\"]}");
	add("{\"term\":\"calcium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14656826\"]}");
	add("{\"term\":\"calculation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05804431\", \"05810193\", \"00870588\"]}");
	add("{\"term\":\"calculator\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02942270\", \"09906486\"]}");
	add("{\"term\":\"calculus\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06023090\", \"09478055\", \"09253675\"]}");
	add("{\"term\":\"calcutta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08923604\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }