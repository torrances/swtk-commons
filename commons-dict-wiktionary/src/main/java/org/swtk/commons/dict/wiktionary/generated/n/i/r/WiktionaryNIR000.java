package org.swtk.commons.dict.wiktionary.generated.n.i.r;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryNIR000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("nirgunty", "{\"term\":\"nirgunty\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A low-ranking official responsible for the regulation of irrigation and the distribution of water\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1807\u0027\u0027, Francis Buchanan, \u0027A Journey from Madras Through the Countries of Mysore, Canara, and Malabar\u0027, [http://books.google.co.uk/books?id\u003dWnTq2fz8l8QC\u0026amp;pg\u003dPA269\u0026amp;dq\u003d%22gunty%22\u0026amp;lr\u003d\u0026amp;ei\u003dz6IyS7bdHJSuyAS2qLjLAQ\u0026amp;cd\u003d14\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003d%22gunty%22\u0026amp;f\u003dfalse page 269\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027\u0027Nirgunty\u0027\u0027\u0027 is generally a \u0027Whallia;\u0027 but sometimes a \u0027Súdra\u0027 holds the office, which is hereditary\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"1811\u0027\u0027, John Pinkerton, \u0027A General Collection of the Best and Most Interesting Voyages and Travels in All Parts of the World\u0027, volume 8, [http://books.google.co.uk/books?id\u003d_1QnAAAAMAAJ\u0026amp;pg\u003dPA658\u0026amp;lpg\u003dPA658\u0026amp;dq\u003dNirgunty\u0026amp;source\u003dbl\u0026amp;ots\u003dIbLBnmJ4EI\u0026amp;sig\u003dRT0jvE7N8uYA7yxhDgwpKlkn0j0\u0026amp;hl\u003den\u0026amp;ei\u003do8UyS-XlJcui4QbGndGqCA\u0026amp;sa\u003dX\u0026amp;oi\u003dbook_result\u0026amp;ct\u003dresult\u0026amp;resnum\u003d3\u0026amp;ved\u003d0CA4Q6AEwA\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003dNirgunty\u0026amp;f\u003dfalse page 658\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"The proper buſineſs of the diviſion of Whalliaru, called Moraſu, is the cultivation of the ground, in which both men and women are very induſtrious; but they do not appear to have ever formed a part of the native militia, like the Súdra cultivators, nor to have ever been entruſted with arms, until they began to enter into the Company’s ſervice. From among them ſeveral families hold, by hereditary right, the low village offices of Toti and \u0027\u0027Nirgunty\u0027\u0027, or of watchmen and conductors of water\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"1826\u0027\u0027, \u0027The History of British India\u0027, volume 1, [http://books.google.co.uk/books?id\u003dNFoPAAAAQAAJ\u0026amp;pg\u003dPA265\u0026amp;dq\u003d%22gunty%22\u0026amp;lr\u003d\u0026amp;ei\u003dWJ8yS4CaOpS8ywSV6oSuAQ\u0026amp;cd\u003d6\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003d%22gunty%22\u0026amp;f\u003dfalse page 265\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"When these allowances are withdrawn the heap is measured; and for every candaca which it contains, a measure equal to 5\u0026amp;nbsp;1/10 Winchester bushels, there is again deducted half a seer to the village watchmen, two and a half seers to the accomptant, as much to the chief of the village; and the bottom of the heap, about an inch thick, mixed with the cow-dung which in order to purify it had been spread on the ground, is given to the \u0027\u0027Nirgunty\u0027\u0027, or conductor of water\", \"priority\":10}]}, \"synonyms\":{}}");

	add("nirvana", "{\"term\":\"nirvana\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|sa|निर्वाण|tr\u003dnir-vāṇa||blown or put out, extinguished|lang\u003den}}, from \u0027निस्\u0027 (out) + \u0027वा\u0027 (to blow)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"complete cessation of suffering; a blissful state attained through realization of sunyata; enlightened experience\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"state of paradise; heightened or great pleasure\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }