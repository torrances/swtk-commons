package org.swtk.commons.dict.wiktionary.generated.i.n.w;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryINW000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("inwardness", "{\"term\":\"inwardness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|inward|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The characteristic of being inward; directed towards the inside\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Internal or true state; essential nature\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"the \u0027\u0027inwardness\u0027\u0027 of conduct\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Sense can not arrive to the \u0027\u0027inwardness\u0027\u0027 of things.\u0027 \u0026amp;mdash; Dr. H. More\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"intimacy; familiarit\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"1599\u0027\u0027, w:William William Shakespeare, \u0027w:Much Ado About Much Ado About Nothing\u0027, s:Much Ado About Nothing Act 4 Scene\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"BENEDICK. Signior Leonato, let the friar advise you\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"And though you know my \u0027\u0027inwardness\u0027\u0027 and lov\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"Is very much unto the prince and Claudio\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"Yet, by mine honour, I will deal in thi\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"As secretly and justly as your sou\", \"priority\":11},{\"upperType\":\"NOUN\", \"text\":\"Should with your body\", \"priority\":12},{\"upperType\":\"NOUN\", \"text\":\"heartiness; earnestnes\", \"priority\":13},{\"upperType\":\"NOUN\", \"text\":\"What was wanted was more \u0027\u0027inwardness\u0027\u0027, more feeling.\u0027 \u0026amp;mdash; M. Arnold\", \"priority\":14}]}, \"synonyms\":{}}");

	add("inwit", "{\"term\":\"inwit\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"middle english (1100-1500)\"], \"text\":\"From Middle english (1100-1500) {{m|enm|inwit||mind, reason, intellect, understanding; soul, spirit; feeling; the collection of inner faculties; one of five inner faculties; one of the outer bodily senses.; inward awareness of right or wrong, conscience}}, from Old english (ca. 450-1100) *\u0027\u0027 (inwitt) {{m|ang|inġewitnes||consciousness, conscience, knowledge, knowing}}, equivalent to {{prefix|in|wit|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Inward knowledge or understanding\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"quot;Will it make you happy?\u0026quot; / \u0026quot;Probably not,\u0026quot; Kai said irritably. \u0026quot;\u0027\u0027Inwit\u0027\u0027 tells me that you\u0027re trouble from the beginning.\u0026quot; \u0026amp;mdash; Midori Snyder, \u0027Sadar\u0027s Keep\u0027, A Tom Doherty Associates Book, New York, 1991\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Conscience; inward sense of morality\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Speaking to me. They wash and tub and scrub. Agenbite of \u0027\u0027inwit\u0027\u0027. Conscience. \u0026amp;mdash; James Joyce, \u0027Ulysses\u0027, 192\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"quot;I knew that was so. Every time that \u0027\u0027inwit\u0027\u0027 twanged -- I have conscience like you, reverend sir!\u0026quot; -- \u0026amp;mdash; Marcia Davenport, \u0027Constant Image\u0027, 196\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Inwit\u0027\u0027, a term for conscience, suggests the inner senses and interior sensibility, which accords nicely with the current state of the senses under the regime of electric technologies. \u0026amp;mdash; Marshall McLuhan, \u0027The Agenbite of Outwit\u0027, 199\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"quot;What\u0027s the matter? Can\u0027t a ballplayer - an ex-ballplayer - have a literate vocabulary?\u0026quot; / \u0026quot;Sure. But \u0027qualm?\u0027 \u0026quot; / \u0026quot;How about \u0027the aginbite of \u0027\u0027inwit\u0027\u0027 then?\u0026quot; \u0026amp;mdash; Paul Di Filippo, \u0027Seeing is believing\u0027, Fantasy \u0026amp; Science Fiction: Apr 2003:. Vol. 104, Iss. 4; pg. 131\", \"priority\":7}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }