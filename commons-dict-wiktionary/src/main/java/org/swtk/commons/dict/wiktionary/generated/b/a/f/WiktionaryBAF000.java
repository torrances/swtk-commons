package org.swtk.commons.dict.wiktionary.generated.b.a.f;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBAF000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("baffie", "{\"term\":\"baffie\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A slipper, or a worn, comfortable shoe\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2000\u0027\u0027, Kate Atkinson, \u0027Emotionally Weird\u0027, Macmillan (2001), ISBN 978-0-312-27999-8, [http://books.google.com/books?id\u003dGCVmg3VAYNcC\u0026amp;pg\u003dPA40\u0026amp;dq\u003dbaffies page 40\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"the inhabitants\u0027 benign indifference to idiosyncratic behavior (the way, for example, that you could walk down the street in nothing but a pair of \u0027\u0027baffies\u0027\u0027 with a budgerigar on your head and no-one would think twice of it\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2001\u0027\u0027, Janet Paisley, \u0027Not for Glory\u0027,\u0026lt;sup \u0026gt;[http://books.google.com/books?id\u003dZoMhAQAAIAAJ ]\u0026lt;/sup\u0026gt; Canongate, ISBN 9781841951744, page 241\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"put him oot the door in his semmit an his \u0027\u0027baffies\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2003\u0027\u0027, Katie MacAlister, \u0027Men in Kilts\u0027, Penguin Group, ISBN 978-0-451-41113-6, [http://books.google.com/books?id\u003dwqYOuOXj2PYC\u0026amp;pg\u003dPA87\u0026amp;dq\u003dbaffles page 87\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"“You can’t be walking about in the muck with naught but your skirts and \u0027\u0027baffies\u0027\u0027. ” ¶ By process of elimination I narrowed the word \u0027\u0027baffies\u0027\u0027 to mean some sort of footwear\", \"priority\":7}]}, \"synonyms\":{}}");

	add("bafflectomy", "{\"term\":\"bafflectomy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|baffle|ectomy|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The removal of baffles from stock motorcycle exhaust canisters\", \"priority\":1}]}, \"synonyms\":{}}");

	add("bafflegab", "{\"term\":\"bafflegab\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|baffle|gab|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Language whose purpose is to obscure, confuse, or mislead\", \"priority\":1}]}, \"synonyms\":{}}");

	add("bafflement", "{\"term\":\"bafflement\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|baffle|ment|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or result of being baffled, puzzled, or confused\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1920\u0027\u0027, w:Mary Roberts Mary Roberts Rinehart, \u0027The Bat\u0027, ch. 12\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"quot;Have you any theory about this occurrence to-night?\u0026quot; She watched him eagerly as she asked the question\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"He made a gesture of \u0027\u0027bafflement\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"quot;None whatever—it\u0027s beyond me,\u0026quot; he confessed\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Something that causes a state of confusion or puzzlement\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"2005\u0027\u0027 Dec. 16, w:Josh Josh Tyrangiel, \u0026quot;[http://www.time.com/time/arts/article/0,8599,1142059,00.html Best of 2005: Music],\u0026quot; \u0027Time\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"The cartoon characters on the front cover, the irritatingly meaningless track names . . . make it seem like a concept album about global warming for kids. Since the lyrics remain a \u0027\u0027bafflement\u0027\u0027, it might well be\", \"priority\":8}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }